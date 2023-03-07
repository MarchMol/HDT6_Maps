import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static HashMap<String, ArrayList<String>> ola = new HashMap<String, ArrayList<String>>();
    public static void main(String[] args) {
        Reader();
        ArrayList<String> wikiwiki = ola.get("Mueble de terraza\t");

        for(int i = 0; i<wikiwiki.size()-1; i++){
            System.out.println(wikiwiki.get(i));
        }
    }

    public static void Reader() {
        String[] a;
        String pasado = "";
        try (BufferedReader br = new BufferedReader(new FileReader("src/inventario.txt"))) {
            String line;
            ArrayList<String> temp = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                a = line.split(" \\|"+ "\t");
                if(!a[0].equals(pasado)){
                    temp = new ArrayList<String>();
                    temp.add(a[1]);
                    ola.put(a[0],temp);
                } else{
                    ola.put(a[0],temp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}