package Loops.While;

/**
 * Infinite loops occur when the condition will never evaluate to false.
 * This can cause your entire program to crash.
 * */
// Importing the Random library
import java.util.Random;

class LuckyFive {

    public static void main(String[] args) {

        // Creating a random number generator
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // Repeat while roll isn't 5
        while (dieRoll != 5) {
            System.out.println(dieRoll);
            dieRoll = randomGenerator.nextInt(6) + 1;
        }

    }
}
