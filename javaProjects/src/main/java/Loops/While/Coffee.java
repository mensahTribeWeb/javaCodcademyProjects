package Loops.While;

// Incrementing While Loops
/**
 * while loops: These are useful to repeat a code
 * block an unknown number of times until some
 * condition is met.
 * */

public class Coffee {
    public static void main(String[] args) {

        // initialize cupsOfCoffee
        int cupsOfCoffee = 1;

        // add while loop with counter
        while(cupsOfCoffee <= 100) {

            System.out.println("Fry drinks cup of coffee #"+ cupsOfCoffee);
            cupsOfCoffee++;

        }
    }
}
