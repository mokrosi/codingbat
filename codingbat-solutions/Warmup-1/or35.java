public class or35 {
    public boolean or35(int n) {
        if (n > 0) {
            if ((n % 3) == 0) {
                return true;
            }
            if ((n % 5) == 0) {
                return true;
            }
        }
        return false;
    }

}
