// Geldona Lapi
// CIT 260
// Week 11
// Project 1
// Date 7/02/2021




package week11;

import java.util.ArrayList;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //   Creates an ArrayList<Employee>

        ArrayList<Employee> list = new ArrayList();


        //  Hourly employee Harry Hacker, serial number 123. Harry earns $15.00 and hour and works 30 hours a week.
        //  Hourly employee Isabell Intern, serial number 233. Isabel earns $12.50 and hour and works 20 hours a week.
        //  Salaried employee Cathy Coder (Catherine Coder), serial number 611. Cathy earns $80,000 a year.

        Hourly e1 = new Hourly("Harry Hacker", 123, 15, 30);
        Hourly e2 = new Hourly("Isabell Intern", 233, 12.50, 20);
        Salaried e3 = new Salaried("Catherine Coder", 611, 80000);
        list.add(e1);
        list.add(e2);
        list.add(e3);

        // Print results
        //Using an appropriate loop to go through the Employees in the ArrayList, print out a payroll report as shown in the following diagram:

        System.out.println("Payroll Report:");
        for (Employee employee : list) {
            System.out.format(String.valueOf(employee));
        }

        // print Goodbye message
        System.out.format("\n\nGoodbye!...");
    }
}



