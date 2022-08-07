package Loops.IteratingOverArraysAndArrayList;

import java.util.ArrayList;

/**
 * Arrays
 * for (int i = 0; i < secretCode.length; i++) {
 *   // Increase value of element value by 1
 *   secretCode[i] += 1;
 * }
 *
 * ArrayList
 * int i = 0; // initialize counter
 *
 * while (i < secretCode.length) {
 *   secretCode[i] += 1;
 *   i++; // increment the while loop
 * }
 *
 * */

public class CalculateTotal {
    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses
        for(int i = 0; i < expenses.size(); i++){
            total += expenses.get(i);
        }

        System.out.println(total);

    }
}
