package ControlsAndConditionals.Projects;

import java.util.Scanner;

/**
 * A Simple Car Loan Payment Calculator
 * Let’s combine a few of the concepts that you have learned so far: conditionals, Boolean expressions, and arithmethic expressions.
 *
 * In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:
 *
 * Car loan amount
 * Interest rate of the loan
 * Length of the loan (in years)
 * Down payment
 * */

public class CarLoan {
    Scanner input = new Scanner(System.in);
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment) {
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
            System.exit(0);
        }
        this.carLoan = carLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
    }

    public void setDownPayment(){
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
            System.exit(0);
        }
        else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full");
        }
        else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance*interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
    public static void main(String[] args) {

    CarLoan user1 = new CarLoan(10000, 3, 5, 2000);
    user1.setDownPayment();
    }
}
