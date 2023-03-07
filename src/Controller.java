import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Controller {

    public Map<String, ArrayList<String>> AgregarProducto(Map<String, ArrayList<String>> mapInventario, Map<String, ArrayList<String>> mapColeccion){
        View vw = new View();

        try{
            String cat = vw.CategMenu();
            if (mapInventario.containsKey(cat)){
                String prod = vw.ProductoMenu(mapInventario.get(cat));
                if(mapInventario.get(cat).contains(prod)){
                    if(mapColeccion.containsKey(cat)){
                        mapColeccion.get(cat).add(prod);
                    } else{
                        ArrayList<String> temp = new ArrayList<String>();
                        temp.add(prod);
                        mapColeccion.put(cat,temp);
                    }
                    System.out.println("Producto agregado a la coleccion exitosamente");
                } else{
                    System.out.println("Producto no encontrado.");
                }
            } else{
                System.out.println("Categoria no encontrada");
            }

        } catch(Exception e){}
        return mapColeccion;
    }

    public void MostrarCategoria(Map<String, ArrayList<String>> mapInventario){
        View vw = new View();
        String prod = vw.getProducto();
        if(mapInventario.containsValue(prod)){

        }

    }
    public void MostrarDatos(){

    }

    public void MostrarDatosOrdered(){ // Ordenados por categoria

    }

    public void MostrarInventario(Map<String, ArrayList<String>> mapInventario){
        String[] keysArray = mapInventario.keySet().toArray(new String[mapInventario.size()]);
        ArrayList<String> KeysOrdered = new ArrayList<String>(Arrays.asList(keysArray));
        for(int i = 0; i < KeysOrdered.size(); i++){
            System.out.println((i+1)+". "+KeysOrdered.get(i)+": "+mapInventario.get(KeysOrdered.get(i)));
        }
        System.out.println("");

    }

    public void MostrarInventarioOrdered(Map<String, ArrayList<String>> mapInventario){
        String[] keysArray = mapInventario.keySet().toArray(new String[mapInventario.size()]);
        ArrayList<String> KeysOrdered = new ArrayList<String>(Arrays.asList(keysArray));
        Collections.sort(KeysOrdered);
        for(int i = 0; i < KeysOrdered.size(); i++){
            System.out.println((i+1)+". "+KeysOrdered.get(i)+": "+mapInventario.get(KeysOrdered.get(i)));
        }
        System.out.println("");
    }

}
