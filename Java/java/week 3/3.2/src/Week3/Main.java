//Source code for project W03dot2
//Geldona Lapi
// CIT-260
// May 4, 2021

package Week3;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here
        //   Tells the user what the program does.
        Scanner input = new Scanner(System.in);

        System.out.print("Given a year and a month in that year, this program will tell you \n the number of days in that month.");

        //        Prompts the user to enter a year.
        System.out.print(" Enter a year: ");

        //Gets the user's input and saves it.
        int year = input.nextInt();

        //Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
        System.out.print(" Enter a value for the month(1 = Jan, 2 = Feb, etc):");

        //Gets the user's input and saves it. If the value is is not between 1 and 12 inclusive, tell the user and terminate the program.
        int month = input.nextInt();
        if (month <= 0 || month > 12) {
            System.out.println(month + " is invalid. Month values must be between between 1 and 12, inclusive.\n" +
                    "Goodbye.");
            System.exit(1);
        }

        //Calculates the number of days in that month.


        // Your program should correctly handle leap years (see listing 3.7 in the textbook).
        //Displays the number of days in that month.

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && month == 2) {
            System.out.println("February of " + year + " has 29 days in it");
        }
        else if ((!(year % 4 == 0 && year % 100 != 0) || !(year % 400 == 0)) && month == 2) {
            System.out.println("February of " + year + " has 28 days in it");
        }



            if (month == 1) {
                System.out.println("January of " + year + " has 31 days in it");
            } else if (month == 3) {
                System.out.println("March of " + year + " has 31 days in it");
            } else if (month == 4) {
                System.out.println("April of " + year + " has 30 days in it");
            } else if (month == 5) {
                System.out.println("May of " + year + " has 31 days in it");
            } else if (month == 6) {
                System.out.println("June of " + year + " has 30 days in it");
            } else if (month == 7) {
                System.out.println("July of " + year + " has 31 days in it");
            } else if (month == 8) {
                System.out.println("August of " + year + " has 31 days in it");
            } else if (month == 9) {
                System.out.println("September of " + year + " has 31 days in it");
            } else if (month == 10) {
                System.out.println("October of " + year + " has 31 days in it");
            } else if (month == 11) {
                System.out.println("November of " + year + " has 31 days in it");
            } else if (month == 12) {
                System.out.println("December of " + year + " has 31 days in it");
            } else {
                System.out.println("System error");
                System.exit(1);
            }

            //Outputs a goodbye message.

            System.out.print("Goodbye\n");
        }


    }

