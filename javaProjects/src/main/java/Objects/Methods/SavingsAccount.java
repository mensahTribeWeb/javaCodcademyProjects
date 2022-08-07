package Objects.Methods;

public class SavingsAccount {

    static int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+ balance);
    }
    public int deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited "+ amountToDeposit);
        return amountToDeposit;
    }
    public static int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew "+ amountToWithdraw);
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

    }
}
