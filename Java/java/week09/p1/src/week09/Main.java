// Geldona Lapi
// CIT 260
// Week 9
// Project 1
// Date 6/18/2021


package week09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here


        // Tell the users what the program does
        Scanner input = new Scanner(System.in);
        System.out.format("This program creates a point at (0,0) and a point at the coordinates \n" +
                "entered by you. It then computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.\n");

        //Prompts the user to enter the x and y coordinates of a point.
        //Saves the users input.
        MyPoint p1 = new MyPoint();
        System.out.print("Enter the x coordinate of a point: ");
        int x = input.nextInt();

        System.out.print("\nEnter the y coordinate of a point: ");
        int y = input.nextInt();
        MyPoint p2 = new MyPoint(x, y);

        //Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point
        // at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.

        System.out.format("Using method 1, the distance from (0,0) to (%d,%d) is %.2f\n", x, y, p1.distance(x, y));

        //Uses the parameterized constructor to create a MyPoint object p2 using the x-coordinate and the y-coordinate entered  by the user.
        System.out.format("Using method 2, the distance from (0,0) to (%d,%d) is %.2f\n", x, y, p1.distance(p2));

        //Uses the second and third distance methods to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2.
        // The distance is displayed with two digits after the decimal point.

        System.out.format("Using method 3, the distance from (0,0) to (%d,%d) is %.2f\n", x, y,
                MyPoint.distance(p1, p2));
        input.close();

        // display a Goodbye message .
        System.out.format("Goodbye!...");

    }

}