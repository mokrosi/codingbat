public class stringTimes {
    public String stringTimes(String str, int n) {
        if (n == 0) {
            return "";
        }
        String x = str;
        for (int i = 1; i < n; i++) {
            str = str + x;
        }
        return str;
    }  
}