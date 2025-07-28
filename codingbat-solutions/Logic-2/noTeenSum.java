
public class noTeenSum {
    public int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (!(a > 12 && a < 15) && !(a > 16 && a < 20)) {
            sum = sum + a;
        }
        if (!(b > 12 && b < 15) && !(b > 16 && b < 20)) {
            sum = sum + b;
        }

        if (!(c > 12 && c < 15) && !(c > 16 && c < 20)) {
            sum = sum + c;
        }
        return sum;
    }

}
