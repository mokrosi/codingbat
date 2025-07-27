import java.util.Map;

public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String valA = map.get("a");
            String valB = map.get("b");

            if (valA != null && valB != null) {
                if (valA.length() != valB.length()) {
                    map.put("c", valA.length() > valB.length() ? valA : valB);
                } else {
                    map.put("a", "");
                    map.put("b", "");
                }
            }
        }

        return map;

    }

}
