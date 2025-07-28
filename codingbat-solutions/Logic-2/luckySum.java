
public class luckySum {
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum = sum + a;
        } else {
            return sum;
        }
        if (b != 13) {
            sum = sum + b;
        } else {
            return sum;
        }
        if (c != 13) {
            sum = sum + c;
        }

        return sum;

    }

}
