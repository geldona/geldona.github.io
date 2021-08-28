//Source code for project W04dot1
//Geldona Lapi
// CIT-260
// May 12, 2021
// For bonus points "yoyo"


package Week04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // write your code here
        //Tells the user what the program does.

        Scanner input = new Scanner(System.in);

        System.out.print("This program converts a hexadecimal digit into a four digit binary number.");

        // Prompts the user to enter a single hexadecimal digit.
        System.out.print(" Enter a hexadecimal number:");

        // Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
        char ch=input.nextLine().charAt(0);


        // Converts the hexadecimal digit into a four digit binary number. You may not use any of the conversion methods built into Java, such as toBinaryString( ), to do this.
        // Outputs the four digit binary number, including any leading zeros.


        String binHex = "";
         switch (ch) {
                case '0': binHex = "0000"; break;
                case '1': binHex = "0001"; break;
                case '2': binHex = "0010"; break;
                case '3': binHex = "0011"; break;
                case '4': binHex = "0100"; break;
                case '5': binHex = "0101"; break;
                case '6': binHex = "0110"; break;
                case '7': binHex = "0111"; break;
                case '8': binHex = "1000"; break;
                case '9': binHex = "1001"; break;
                case 'A': binHex = "1010"; break;
                case 'B': binHex = "1011"; break;
                case 'C': binHex = "1100"; break;
                case 'D': binHex = "1101"; break;
                case 'E': binHex = "1110"; break;
                case 'F': binHex = "1111"; break;
                default: System.out.println(ch + " It is not a valid hexadecimal digit"); System.exit(1);
            }

            System.out.format("The binary value is " + binHex);
        //Outputs a goodbye message.
        System.out.println(" Goodbye");
        }

    }




