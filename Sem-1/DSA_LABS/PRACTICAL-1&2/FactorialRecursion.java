import java.util.Scanner;

public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);

        inp.close();
    }
}
