public class old35 {
    public boolean old35(int n) {
        boolean divBy3 = (n % 3 == 0);
        boolean divBy5 = (n % 5 == 0);
        return divBy3 ^ divBy5;
    }

}
