/**
 * Factorial using Recursion
 */
public class Factorial {

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + factorial(num));
    }
}
