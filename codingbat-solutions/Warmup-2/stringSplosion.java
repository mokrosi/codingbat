public class stringSplosion {
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            result.append(str.substring(0, i));
        }

        return result.toString();

    }
}
