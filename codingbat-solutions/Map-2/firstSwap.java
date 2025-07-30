import java.util.*;
public class firstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> swapped = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (swapped.contains(firstChar)) {
                continue;
            }

            if (map.containsKey(firstChar)) {
                int prevIndex = map.get(firstChar);

                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                swapped.add(firstChar);
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }

        return strings;

    }

}
