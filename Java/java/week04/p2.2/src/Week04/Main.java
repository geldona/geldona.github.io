
//Source code for project W04dot2
//Geldona Lapi
// CIT-260
// May 12, 2021
// For bonus points "yoyo"

package Week04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    Tells the user what the program does.
        Scanner input = new Scanner(System.in);

        System.out.print(" Given your name, hours worked, and hourly wage, this program calculates your \n" +
                " gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                " It then displays your pay stub.");

        //            Prompts the user to enter their first and last name.
        //            Gets the user's input and saves it as a String.

        System.out.print("Enter your first and last name: ");
        String name = input.nextLine();

        //Prompts the user to enter the number of hours they worked this week.
        System.out.print("Enter the hours you worked this week: ");

        //      Gets the user's input and saves it.
        double hours =input.nextDouble();

        //Prompts the user to enter their hourly wage.
        System.out.print("Enter your hourly wage: ");

        //Get's the user's input and saves it.
        double hourlyWage =input.nextDouble();

        //      Calculates the gross pay.
        double grossP= hours*hourlyWage;

        //      Calculates the state withholding tax (9%) and the federal withholding tax (20%)
        final double S_RATE=0.09;
        final double F_RATE=0.20;
        double sTax=S_RATE*grossP;
        double fTax=F_RATE*grossP;

       //      Calculate  net pay after subtracting the withholding taxes.
        double netPay=grossP-sTax-fTax;

       // Outputs a pay statement as shown in the example in the assignment.
        // Pay Stub for John Brown
        //   Hours Worked: 10
        //   Hourly Wage: $9.75
        //   Gross Pay: $97.50
        //   State Tax Withheld: $8.78
        //   Federal Tax Withheld: $19.50
        //   Net Pay: $69.23

       // Outputs a goodbye message.

        System.out.format("Pay Stub for " + name);
        System.out.format ("\nHours Worked: ");
         System.out.format ("%4.2f",hours);
        System.out.format (  "\nPay Rate: $" + hourlyWage );
        System.out.format (   "\nGross Pay: $" );
        System.out.format ("%4.2f",grossP) ;
        System.out.format ( "\nState Tax Withheld: $" );
        System.out.format ("%4.2f",sTax );
        System.out.format (  "\nFederal Tax Withheld: $");
        System.out.format ("%4.2f",fTax);
        System.out.format ("\nNet Pay: $");
        System.out.format ("%4.2f",netPay);
        System.out.println("\nGoodbye");


    }
}
