package ControlsAndConditionals.Flow;

import java.util.Scanner;

/**
 * The code editor contains an Order class to track retail
 * shipments.
 *
 * Write an if-then statement that prints High value item!
 * when itemCost is greater than 24.00
 * */
public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a cost of an item: ");
        double itemCost= scan.nextDouble();
        boolean highValueItem = itemCost >= 24.00;

        if(highValueItem){
            System.out.println("High value item!");
      }
    }
}
