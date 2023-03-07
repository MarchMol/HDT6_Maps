import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Factory {
    public Map<String, Integer> Map_Factory(int i){
        return switch(i){
            case 1 -> new HashMap<String, Integer>();
            case 2 -> new LinkedHashMap<String, Integer>();
            case 3 -> new TreeMap<String, Integer>();
            default -> null;
        };
    }
}
