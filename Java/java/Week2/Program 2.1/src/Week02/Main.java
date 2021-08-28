// Source code for project W01dot1
// Geldona Lapi
// CIT-260
// April 26, 2021
package Week02;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("This program converts a temperature in degrees Celsius into \na temperature in degrees Fahrenheit. Enter a temperature in\ndegrees Celsius:");
        // create variable from input
        double tempc = input.nextDouble();
        // calculate formula
        double tempf = 9 * tempc / 5 + 32;
        // Print out the degrees Celcius and Fahrenheit
        System.out.format("%5.2f",tempc);
        System.out.print(" degrees Celsius is equal to ");
        System.out.format("%5.2f",
                tempf);
        System.out.print(" degrees Fahrenheit.\n" );
        System.out.println("Goodbye");
    }
}
