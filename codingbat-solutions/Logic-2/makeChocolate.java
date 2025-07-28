
public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigBars = goal / 5;
        int bigBarsUsed = Math.min(big, maxBigBars);
        int remainder = goal - (bigBarsUsed * 5);

        if (small >= remainder) {
            return remainder;
        }
        return -1;
    }
}
