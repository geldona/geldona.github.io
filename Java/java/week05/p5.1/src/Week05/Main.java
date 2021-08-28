//Source code for project W05dot1
//Geldona Lapi
// CIT-260
// May 19, 2021


// Tells the user what the program does. This program converts  kilograms to pounds
package Week05;

public class Main {

    public static void main(String[] args) {

	// write your code here
    // Tell the users what the program does
    System.out.println("This program  calculate pounds per kilogram");
    // Create constant that shows that 1 kg=2.2 pounds

        final double KG_TO_POUNDS= 2.2;

    // Display header for table
        System.out.println("Kilogram  Pound \n" +
                "--------  -----");


    // Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds)
    // increment by 2
        for (int i = 1; i <= 15; i += 2) {
    // Display table format columns
    // Calculate kg to pound, where i is kg
            System.out.format (
                    "%-10d%5.2f\n", i, (i * KG_TO_POUNDS));
        } // end of the loop


    // Outputs a goodbye message.
        System.out.println("Goodbye");

    }
}
