public class stringX {
    public String stringX(String str) {
        if (str.length() <= 2)
            return str; 
        String mid = str.substring(1, str.length() - 1).replace("x", "");
        return str.charAt(0) + mid + str.charAt(str.length() - 1);
    }

}
