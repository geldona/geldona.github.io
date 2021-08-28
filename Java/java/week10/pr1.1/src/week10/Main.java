// Geldona Lapi
// CIT 260
// Week 10
// Project 1
// Date 6/26/2021
// The main Driver CLass
//Tells the user what the program does.
//Prompts the user to enter the values for the sides, color, and filled attribute for a triangle object.
//Saves the users input.
//Using the values entered by the user, creates the Triangle object.
//Displays the string representation of the Triangle object by calling its toString( ) method. Look at the output example below to see what this output should look like.
//Displays a goodbye message.

package week10;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

            double side1, side2, side3;
            String color;

            System.out.format("This program gets input for a triangle from the user.\n" +
                    "It then creates a Triangle object and displays its description.\n");
            Scanner side = new Scanner(System.in);
            // Tells the user what the program does.



            //Prompts the user to enter the values for the sides, color, and filled attribute for a triangle object.
            //Saves the users input.

            System.out.format("Enter the color of the triangle (e.g. \"red\"):");
            color =side.nextLine();

            System.out.format("Is the triangle filled (true or false):");
            boolean filled = side.nextBoolean();

            System.out.format("Enter the non-zero, positive lengths of the three sides of the triangle: ");
            side1 = side.nextDouble();
            side2 = side.nextDouble();
            side3 = side.nextDouble();

            // Using the values entered by the user, creates the Triangle object.
            Triangle tri = new Triangle(side1, side2, side3,color,filled);


            //Displays the string representation of the Triangle object by calling its toString( ) method

            System.out.println("\nTriangle Output:");
            System.out.println(tri.toString());

             //Displays a goodbye message
             System.out.format("\nGoodbye!...");

        }
    }
