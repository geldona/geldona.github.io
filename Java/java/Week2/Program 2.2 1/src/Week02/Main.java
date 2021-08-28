/*

 Week02 second program
 Calculate the total bill including tax, tip
 Print the result

*/

package Week02;

        import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // Enter code here
        // Create constant variable
        final double tax_rate=0.032;

        // Create scanning code for input

        Scanner input = new Scanner(System.in);

        // Print what input we are looking for. Ask for the cost of the meal

        System.out.print("  Given the price of a meal and a percentage to use for the tip, \nthis program calculates the tip, the tax, and the total amount of the bill.");
        System.out.print("Enter the cost of the meal:");
        //
        double cost = input.nextDouble();

        System.out.print("Enter the tip percentage:");

        // Create variables, insert formulas.

        double tipperc = input.nextDouble();

        double tip = cost * tipperc / 100;

        double tax = tax_rate * cost;

        double totalbill = cost + tip + tax;

        // Print the results of the variables.

        System.out.format(" The tip is  $%5.2f.%n", tip);

        System.out.format("The tax is  $%5.2f.%n", tax);

        System.out.format("The total bill is $%5.2f.%n", totalbill);

        System.out.println("Goodbye\n");
    }
}
