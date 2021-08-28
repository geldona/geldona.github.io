// Geldona Lapi
// CIT 260
// Week 6
// Project 6.2
// Date 5/27/2021


package Week06;


public class Main {

    public static void main(String[] args) {
    // write your code here
    //Tell the user what the program does.
      System.out.println("This program converts Celsius to Fahrenheit and Fahrenheit to Celsius ");



         // Display table
        System.out.println( // Print the head of the table
                "Celsius  Fahrenheit | Fahrenheit    Celsius" +
              "\n----------------------------------------------");

        // Display the information
        for (double tempCelsius = 40, tempFahrenheit = 120;

             tempCelsius >= 31; tempCelsius--, tempFahrenheit -= 10) {

            System.out.format("%.1f", tempCelsius);

            System.out.format("%14.1f  | ", celsiusToFahrenheit(tempCelsius));

            System.out.format("%6.1f",    tempFahrenheit);

            System.out.format("%14.2f\n", fahrenheitToCelsius(tempFahrenheit));

        }
        // Print goodbye
        System.out.println("Goodbye...");
    }

    //Insert the formula

    /**
     *the celsiusToFahrenheit() method
     * Purpose: calculate temperature from celsius to fahrenheit
     * @param tempCelsius, the temperature in celsius
     * @return
     */
    public static double celsiusToFahrenheit(double tempCelsius) {
        return 1.8 * tempCelsius + 32;
    }

    /**
     *the celsiusToFahrenheit() method
     *Purpose: calculate temperature from fahrenheit to celsius
     * @param tempFahrenheit, the temperature in fahrenheit
     * @return 5.0/9.0 * (tempFahrenheit - 32)
     */
    public static double fahrenheitToCelsius(double tempFahrenheit) {
        return 5.0/9.0 * (tempFahrenheit - 32);  }


}