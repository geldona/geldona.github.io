package Week02;

import java.util.Scanner; // Scanner is in the java.util package

public class Main {

    public static void main(String[] args) {
	// the code is here
     // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter degrees Celsius
        System.out.print("This program converts a temperature in degrees Celsius into \n" +
                "   a temperature in degrees Fahrenheit. Enter a temperature in\n" +
                "   degrees Celsius:");
        // Create variables
        double tempc = input.nextDouble();

        // Compute tempf
        double tempf;
        tempf = (9 * tempc)/5 + 32;
        // Display result
        System.out.println(""+ tempc+ " degrees Celsius is equal to " +  tempf + " degrees Fahrenheit.\n" +
                "Goodbye");
    }
    }




