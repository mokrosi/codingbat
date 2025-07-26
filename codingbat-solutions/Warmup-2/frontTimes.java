public class frontTimes {
    public String frontTimes(String str, int n) {
        String front;
        if (str.length() < 4) {
            front = str;
        } else {
            front = str.substring(0, 3);

        }
        String x = front;
        if (n == 0) {
            return "";
        }
        for (int i = 1; i < n; i++) {
            front = front + x;
        }
        return front;

    }
}
