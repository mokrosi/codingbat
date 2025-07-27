import java.util.Map;

public class mapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");

        if (hasA && !hasB) {
            map.put("b", map.get("a"));
        } else if (!hasA && hasB) {
            map.put("a", map.get("b"));
        }

        return map;
    }

}
