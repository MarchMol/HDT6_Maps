import java.io.*;
import java.util.ArrayList;
import java.util.Map;


public class Main {
    public static Map<String, ArrayList<String>> mapInventario;
    public static Map<String, ArrayList<String>> mapColeccion;
    public static void main(String[] args) {
        View vw = new View();
        Controller con = new Controller();
        int fac = vw.MapMenu();
        mapInventario = Map_Factory.Map_Factory(fac);
        mapColeccion = Map_Factory.Map_Factory(fac);
        Reader();
        int op = 0;
        do {
            op = vw.menuMain();
            switch (vw.menuMain()){
                case 1: // Agregar Producto
                    mapColeccion = con.AgregarProducto(mapInventario,mapColeccion);
                    break;
                case 2: // Mostrar categoria de un producto
                    String key = con.MostrarCategoria(mapInventario);
                    if(key!=""){
                        System.out.println("La categoría del producto es: "+key);
                    } else{
                        System.out.println("El producto no fue encontrado.");
                    }
                    System.out.println("");
                    break;
                case 3:
                    con.MostrarInventario(mapColeccion);
                    break;
                case 4:
                    con.MostrarInventarioOrdered(mapColeccion);
                    break;
                case 5: // Mostrar inventario
                    con.MostrarInventario(mapInventario);
                    break;
                case 6: // Mostrar inventarios ordenados
                    con.MostrarInventarioOrdered(mapInventario);
                    break;
                case 7:
                    con.MostrarInventario(mapColeccion);
                    break;
                default:
            }
        } while(op!=8);
    }

    public static void Reader() {
        String[] a;
        try (BufferedReader br = new BufferedReader(new FileReader("src/inventario.txt"))) {
            String line;;
            while ((line = br.readLine()) != null) {
                a = line.split(" "+"\\|"+"\t");

                if(mapInventario.containsKey(a[0])){
                    mapInventario.get(a[0]).add(a[1]);
                } else{
                    ArrayList<String> temp = new ArrayList<String>();
                    temp.add(a[1]);
                    mapInventario.put(a[0],temp);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}