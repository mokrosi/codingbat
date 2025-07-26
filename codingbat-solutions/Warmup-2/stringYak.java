public class stringYak {
    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length();) {

            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 3;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();

    }

}
