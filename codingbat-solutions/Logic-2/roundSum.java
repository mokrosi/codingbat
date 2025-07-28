
public class roundSum {
    public int roundSum(int a, int b, int c) {

        double sum = Math.round(a * 0.1) * 10;
        sum = sum + (Math.round(b * 0.1) * 10);
        sum = sum + (Math.round(c * 0.1) * 10);

        return (int) sum;

    }

}
