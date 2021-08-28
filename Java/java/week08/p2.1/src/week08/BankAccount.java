// Geldona Lapi
// CIT 260
// Week 8
// Project 8.2
// Date 6/12/2021

/**************************************************
 *            *UML Class Diagram   BankAccount     *
 * ------------------------------------------------*
 * accountNumber: private int                      *
 * balance: private int                            *
 * amount: double                                  *
 * getbalance(): double                            *
 * getaccountNumber(): double                      *
 * makeDeposit(): double                           *
 * makeWithdrawal(): double                        *
 * getWhat(): string                               *
 ***************************************************/


package week08;

public class BankAccount {

   private int accountNumber;
    private double balance;


    /**
     * A no-arg constructor that creates a default account object.
     *  It sets both data fields to zero.
     */
    BankAccount(){
        accountNumber=0;
        balance=0;
    }



    /**
     *
     * @param accountNumber specified
     * @param balance specified balance
     */
     public BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
     }

    //Getter methods for accountNumber and balance.


    /**
     *
     * @return balance according to the total amount
     */

    public double getbalance() {
        return balance;
    }

    /**
     *
     * @return show account nr according to the request
     */
    public double getaccountNumber() {
        return accountNumber;
    }



    /**
     *
     * @param amount change in $
     *    makeDeposit balance plus amount
     *
     */
    public void  makeDeposit(double amount ){
                    balance+= amount;
    }
    // A method names makeWithdrawal( ) that takes a double
    // as its argument, and subtracts the value of
    // the argument from the balance

    /**
     *
     * @param amount change in $
     * A makeWithdrawal and subtracts the value of
     *  the argument from the balance
     */

    public void  makeWithdrawal( double amount){
                balance-=amount;
    }

    /**
     *
     * @return the string
     */
    public static String getWhat()
    {
        return ("This program tests the BankAccount class by ... ");
    }


}
