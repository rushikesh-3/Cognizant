import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number to calculate its factorial: ");
        int num=sc.nextInt();
        
        if(num<0) System.out.println("Factorial is not defined for negative numbers.");
        else System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
    private static long factorial(int n){
        if(n==0 || n==1) return 1;

        long result=1;

        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
