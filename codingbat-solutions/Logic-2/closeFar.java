
public class closeFar {
    public boolean closeFar(int a, int b, int c) {
        boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;
        boolean bFar = Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
        boolean cFar = Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;

        return (bClose && cFar) || (cClose && bFar);

    }
}
