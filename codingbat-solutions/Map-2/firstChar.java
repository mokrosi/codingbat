import java.util.*;

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String chr : strings) {
            String firestLater = String.valueOf(chr.charAt(0));
            if (map.containsKey(firestLater)) {
                map.put(firestLater, map.get(firestLater) + chr);
            } else {
                map.put(firestLater, chr);
            }
        }
        return map;
    }

}
