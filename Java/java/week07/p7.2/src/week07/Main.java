
// Geldona Lapi
// CIT 260
// Week 7
// Project 7.2
// Date 6/04/2021

package week07;



public class Main {

    public static void main(String[] args) {
	// write your code here
       // Tell the users what the program does
        System.out.println("This Program computes the number of hours worked for a set of hourly employees.\n");

        //Creates a one-dimensional array of Strings and stores the employee names from the above table in that array.

        String[] names = {"Tara Teamlead", "Harry Hacker",
                "Carl Coder", "Paula Programmer", "Darrin Debugger"};

        // Creates a two-dimensional array and stores the hourly data from the table above in that array.
        double[][] hours = {
                {0.0, 8.0, 8.0, 8.5, 8.0, 9.0, 0.0},
                {0.0, 9.0, 9.0, 8.5, 8.0, 7.5, 0.0},
                {0.0, 8.5, 8.0, 8.6, 8.6, 9.5, 2.0},
                {0.0, 4.75, 6.0, 6.25, 6.5, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 5.25, 5.25, 6.0}};

         // Print the title of the table
        System.out.print("Employee Name       Total Hours\n");

        //Adds up the number of hours for each employee and stores the results.
        // Print the result and print Goodbye
        double[] total = sumhours(hours);
        for (int i=0;i<total.length; i++) {
             System.out.format("%-20s%.2f\n", names[i], total[i]);

        }
        System.out.println("Goodbye!...");
            }

    public static double[] sumhours(double[][] hours) {
        double[] total = new double[hours.length];
        for (int i = 0; i < hours.length; i++) {
            double sum = 0;
            for (int  j = 0; j < hours[ i].length; j++) {
                sum += hours[i][j];
            }
            total[ i] = sum;
        }
        return total;
    }

}





