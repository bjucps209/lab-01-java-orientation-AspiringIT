package app;

import java.util.Random;
import java.util.Scanner;
public class Guess {


    public static void main(String[] args) {
        var g = new Game();


    }

     static class Game {
        int secretNum;
        int numGuesses;
        int guess;
        public Game() {
            Random rand = new Random();
            secretNum = rand.nextInt(1, 11);
            numGuesses = 0;
            guess = 0;

            Scanner scan = new Scanner(System.in);
            while (guess != secretNum) {
                System.out.println("Enter your guess: \n");
                guess = (scan.nextInt());
                numGuesses++;

                if (guess < secretNum) {
                    System.out.println("Your guess is too low\n");
                } else if (guess > secretNum) {
                    System.out.println("Your guess is too high\n");
                } else {
                    System.out.println("You got it!\n");
                }


            }
            System.out.println("It took you " + numGuesses + " guesses \n");

        }


        public Game(int g) {
            secretNum = g;
            numGuesses = 0;
            guess = 0;

            while (guess != secretNum) {
                System.out.println("Enter your guess: \n");
                guess = g;
                numGuesses++;

                if (guess < secretNum) {
                    System.out.println("Your guess is too low\n");
                } else if (guess > secretNum) {
                    System.out.println("Your guess is too high\n");
                } else {
                    System.out.println("You got it!\n");
                }


            }
            System.out.println("It took you " + numGuesses + " guesses \n");

        }
        public String guess(int g) {
            if (g < secretNum) return "low";
            if (g > secretNum) return "high";
            return "correct";
        }
    }
}






