/**
 * Fibonacci using Recursion
 */
public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) {
            return n; // base case
        }
        return fib(n - 1) + fib(n - 2); // recursive call
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci: " + fib(n));
    }
}
