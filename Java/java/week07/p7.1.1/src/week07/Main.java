
// Geldona Lapi
// CIT 260
// Week 7
// Project 7.1
// Date 6/05/2021


package week07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //Tells the use what the program does.
        System.out.format("This program computes the mean and the standard deviation for a set of numbers.\n");

    // Create an array of length 5
     Scanner input = new Scanner(System.in);
     double[] number = new double[5];

     // Invite the  the user to enter a number
        //Displays the mean and the standard deviation with 2 digits after the decimal point.
        //Displays a goodbye message.


                    for (int i = 0; i < number.length; i++) {
                        System.out.print("Enter a number: ");
                        number[i] = input.nextDouble();
                    }

            System.out.format("The mean of this set of numbers is ");
            System.out.format("%.2f", mean(number));
            System.out.format("\nThe standard deviation is ");
            System.out.format("%.2f", deviation(number));
            System.out.format("\nGoodbye!...");
        }

       // calculate the deviation
        public static double deviation(double[] x) {
            double deviation = 0;
            double mean = mean(x);
            for (double ddf: x) {
                deviation += Math.pow(ddf - mean, 2);
            }
            return Math.sqrt(deviation / (x.length - 1));
        }

        // calculate the mean
        public static double mean(double[] x) {
            double mean = 0;
            for (double m: x) {
                mean += m;
            }
            return mean / x.length;
    }
}
