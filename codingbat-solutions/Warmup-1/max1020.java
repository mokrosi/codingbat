public class max1020 {
    public int max1020(int a, int b) {
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);

        if (aInRange && bInRange) {
            return Math.max(a, b);
        }

        if (aInRange) {
            return a;
        }

        if (bInRange) {
            return b;
        }

        return 0;

    }

}
