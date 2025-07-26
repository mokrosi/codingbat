public class doubleX {
    boolean doubleX(String str) {
        int index = str.indexOf("x");
        if (index == -1 || index == str.length() - 1) {
            return false;
        }
        return str.charAt(index + 1) == 'x';

    }

}
