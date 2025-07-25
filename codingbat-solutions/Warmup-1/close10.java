public class close10 {
    public int close10(int a, int b) {
        int aDiff = Math.abs(10 - a);
        int bDiff = Math.abs(10 - b);

        if (aDiff < bDiff) {
            return a;
        } else if (bDiff < aDiff) {
            return b;
        } else {
            return 0;
        }

    }
}
