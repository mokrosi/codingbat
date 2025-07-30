import java.util.*;
public class wordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            if (countMap.get(str) % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();

    }

}
