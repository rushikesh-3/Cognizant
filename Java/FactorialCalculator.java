import java.util.Scanner;

public class FactorialCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if(n<0) System.out.println("Enter a positive number");
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);

        sc.close();
    }
}