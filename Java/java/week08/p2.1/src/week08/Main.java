// Geldona Lapi
// CIT 260
// Week 8
// Project 8.2
// Date 6/12/2021



package week08;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Tells the user what the program does. This program has no user input.

        System.out.println(BankAccount.getWhat());

        //Creates a BankAccount object with an account number of 123 and an initial balance of $5.00

        BankAccount BankAccount1  = new BankAccount(123 , 5.00);
        System.out.println("...Making a deposit of $10.50");
        BankAccount1.makeDeposit(10.5);

        //Makes a deposit of $10.50 into this account.

        System.out.println("...Making a deposit of $3.25");
        BankAccount1.makeDeposit(3.25);

        //Makes a deposit of $3.25 into this account.
        System.out.println("...Making a withdrawal of $1.50");
        BankAccount1.makeWithdrawal(1.25);

        //Makes a withdrawal of $1.50 from this account
        System.out.format("The balance in account number ");
        System.out.format("%3.0f",BankAccount1.getaccountNumber());
        System.out.format(" is $");
        System.out.format(" %.2f",BankAccount1.getbalance());

        System.out.println(     "\nGoodbye...");





    }
}
