package lab;

public class Factorial {
    public static long calculate(long n) {
        if (n == 0) {
            return 1;
        }

        return n * calculate(n - 1);
    }
}
