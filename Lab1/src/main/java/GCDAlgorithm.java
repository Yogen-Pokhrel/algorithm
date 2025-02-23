public class GCDAlgorithm {
    public static int gcd(int m, int n) {
        return findGCD(m, n, Math.min(m, n));
    }

    private static int findGCD(int m, int n, int divisor) {
        if (m % divisor == 0 && n % divisor == 0) {
            return divisor;
        }
        return findGCD(m, n, divisor - 1);
    }
    
    public static void main(String[] args) {
        int m = 1280;
        int n = 1260;
        System.out.println(gcd(m, n));
    }
}
