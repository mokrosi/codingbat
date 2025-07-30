import java.util.*;
public class allSwap {
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> seen = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (seen.containsKey(firstChar)) {
                int prevIndex = seen.get(firstChar);

                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                seen.remove(firstChar);
            } else {
                seen.put(firstChar, i);
            }
        }

        return strings;

    }

}
