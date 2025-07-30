import java.util.*;
public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String chr : strings) {
            if (map.containsKey(chr)) {
                map.put(chr, true);
            } else {
                map.put(chr, false);
            }
        }
        return map;
    }

}
