//Source code for project W03dot1
//Geldona Lapi
// CIT-260
// May 4, 2021

package Week3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        // Tells the user what the program does.
        Scanner input = new Scanner(System.in);
        System.out.print ( "Given today's day of the week and some number of days in the future \n this program will tell you the day of the week for the future day.");
        //Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
        System.out.print (" Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        double day = input.nextDouble();
        //Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
        if (day<0 || day>6){
            System.out.println( day + " is invalid. You must enter a positive number.\n" + "Goodbye.");
            System.exit(1);
        }


        //Prompts the user to enter some number of days in the future. This can be any positive value.
        System.out.print(" Enter the number of days in the future: ");

        //Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.

        //Displays the day of the week for today and the day of the week for the future day.
        int dFuture=input.nextInt();
        if(dFuture<0){
            System.out.println(dFuture + " is invalid. You must enter a positive number.\n" +
                    "Goodbye.");
            System.exit(1);
        }

        //Calculates the day of the week for the future day.

        if (day==0||dFuture%7==0){
            System.out.println("Today is Sunday and the future day is Monday.");
                }

        else if(day==1||dFuture%7==1){
            System.out.println("Today is  Monday and the future day is Tuesday.");
        }

        else if(day==2||dFuture%7==2){
            System.out.println("Today is Tuesday and the future day is Thursday.");
        }

        else if(day==3||dFuture%7==3){
            System.out.println("Today is Thursday and the future day is Friday.");
        }

        else if(day==4||dFuture%7==4){
            System.out.println("Today is Friday and the future day is Saturday.");
        }

        else if(day==5||dFuture%7==5){
            System.out.println("Today is Saturday and the future day is Sunday.");
        }


        //Outputs a goodbye message.
        System.out.println("Goodbye\n");
    }
}
