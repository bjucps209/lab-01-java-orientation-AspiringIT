import java.util.Random;
import java.util.Scanner;
public class Guess {


    public static void main(String[] args){
        Random rand = new Random();
        int secretNum = rand.nextInt(1,11);
        int numGuesses = 0;
        int guess = 0;
        Scanner scan = new Scanner(System.in);
        while(guess != secretNum){
            System.out.println("Enter your guess: \n");
            guess = (scan.nextInt());
            numGuesses++;
            if(guess < secretNum){
                System.out.println("Your guess is too low\n");
            }
            else if(guess > secretNum){
                System.out.println("Your guess is too high\n");
            }
            else{
                System.out.println("You got it!\n");
            }
        }
        System.out.println("It took you " + numGuesses + " guesses \n");
    }
}



