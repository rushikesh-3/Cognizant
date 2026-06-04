import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        int num=rand.nextInt(100)+1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        int guess;
        int attempts=0;

        while(true){
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            attempts++;

            if(guess<num){
                System.out.println("Too low! Try again.");
            } else if(guess>num){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            }
        }
    }
}
