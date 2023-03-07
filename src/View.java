import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private Scanner scan;

    public int menuMain(){
        scan = new Scanner(System.in);
        int op = 0;
        do{
            try{
                System.out.println("Ingrese una opción:");
                System.out.println("1. Agregar producto");
                System.out.println("2. Mostrar categoría de un producto");
                System.out.println("3. Mostrar datos de un producto");
                System.out.println("4. Mostrar datos de un producto (ordenado)");
                System.out.println("5. Mostrar Inventario");
                System.out.println("6. Mostrar Inventario (ordenado)");
                System.out.println("7. Mostrar Colección del usuario");
                System.out.println("8. Salir");
                op = scan.nextInt();
                System.out.println("");
            } catch(Exception e){
            }
        } while (op<1 || op>8);
        return op;
    }
    public int MapMenu(){
        scan = new Scanner(System.in);
        int op = 0;
        do{
            try{
                System.out.println("Escoga la implementación que desea para Map:");
                System.out.println("1. HashMap");
                System.out.println("2. LinkedHashMap");
                System.out.println("3. TreeMap");
                System.out.println("4. Salir");
                op = scan.nextInt();
                System.out.println("");
            } catch(Exception e){
            }
        } while (op<1 || op>4);
        return op;
    }

    public String CategMenu(){
        scan = new Scanner(System.in);
        String cat = "";
        try{
            System.out.println("Ingrese la categoría del producto que desa agregar (escribalo):");
            System.out.println("1. Mueble de terraza");
            System.out.println("2. Sillones de masaje");
            System.out.println("3. Bebidas");
            System.out.println("4. Condimentos");
            System.out.println("5. Frutas");
            System.out.println("6. Carnes");
            System.out.println("7. Lácteos");
            cat = scan.nextLine();
            System.out.println("");
        } catch(Exception e){}
        return cat;
    }

    public String ProductoMenu(ArrayList<String> productos){
        scan = new Scanner(System.in);
        System.out.println("Ahora, ingrese el producto que desea encontrar de la categoría");
        for (int i = 0; i<productos.size(); i++){
            System.out.println(i+1+" "+productos.get(i));
        }
        return scan.nextLine();
    }

    public String getProducto(){
        scan = new Scanner(System.in);
        System.out.println("Ingrese el producto:");
        return scan.nextLine();
    }
}
