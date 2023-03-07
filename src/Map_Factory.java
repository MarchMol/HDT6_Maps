import java.util.*;

public class Map_Factory {
    public static Map<String, ArrayList<String>> Map_Factory(int i){
        return switch(i){
            case 1 -> new HashMap<String, ArrayList<String>>();
            case 2 -> new LinkedHashMap<String, ArrayList<String>>();
            case 3 -> new TreeMap<String, ArrayList<String>>();
            default -> null;
        };
    }
}
