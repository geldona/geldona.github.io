//Source code for project W05dot2
//Geldona Lapi
// CIT-260
// May 19, 2021


package Week05;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        // This program displays a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
        System.out.println("This program displays all of the numbers from 100 to 1000\n" +
                "that are divisible by both 5 and 6. ");

        int COUNTING_DISTANCE = 0;
        // Constant that display 10 numbers per line
        final int LINE = 10;


        // Uses a loop
        // Test all numbers from 100 to 1,000
        for (int i = 100; i < 1001; i++) {
            // Test if numbers are  divisible by both 5 and 6
            if ((i % 6 == 0) && (i % 5 == 0 )) {
                // increment count
                COUNTING_DISTANCE++;
                // Test if numbers per line is 10
                if (COUNTING_DISTANCE % LINE == 0)
                 //Print the result
                    System.out.println(i);
                else
                  // Print the result
                    System.out.format(i + " ");

                //Displays a goodbye message.


            }

        }
        System.out.println("Goodbye!");
    }
}