import java.util.*;

public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            if (!str.isEmpty()) {
                String key = String.valueOf(str.charAt(0));
                String value = String.valueOf(str.charAt(str.length() - 1));
                map.put(key, value);
            }
        }
        return map;

    }
 
}
