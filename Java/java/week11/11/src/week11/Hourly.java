// Geldona Lapi
// CIT 260
// Week 11
// Project 1
// Date 7/02/2021
//In this class we will create:
// A double, hourlyWage,  that holds this person's hourly wage.
//A double, hoursWorked, that holds the number of hours this person worked.
//An appropriate no-arg constructor.
//An appropriate parameterized constructor.
//Getters for hourlyWage and hoursWorked.


/*******************************
 *  UML diagram Hourly          *
 *  *****************************
 * -hoursWorked:double          *
 * -hourlyWage: double          *
 * ------------------------     *
 * +hourly()
 * +getHourlyWage():double       *
 * +getHoursWorked():double      *
 * +getFedWithholding():double   *
 * +getGrossPay():double         *
 * +getStateWithholding():double
 * +toString():String            *
 *******************************/

package week11;

import java.text.DecimalFormat;

public class Hourly extends Employee {
    //Instance variables
    /**
     *
     */
    private double hourlyWage, hoursWorked;

    public Hourly() {
        super();
    }

    /**
     * A member method Hourly that returns, hourlyWages, hoursWorked, serialNumber
     * @param name of employee
     * @param serialNumber of employee
     * @param hourlyWage for each employee
     * @param hoursWorked hours that each employee worked
     */
    public Hourly(String name, int serialNumber, double hourlyWage, double hoursWorked) {
        super(name, serialNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    /**
     * a get method
     * @return hourly wage
     */
    public double getHourlyWage() {
        return this.hourlyWage;
    }

    /**
     *   get method
     * @return hours worked
     */
    public double getHoursWorked() {
        return this.hoursWorked;
    }

    /**
     * calculates gross pay
     * @return the result of the multiplication of hourly wages with hours worked
     */
    @Override
    public double getGrossPay() {
        return this.hoursWorked * this.hourlyWage;
    }

    /**
     *  calculates federal withholding
     * @return the result of multiplication of gross pay with fed tax
     */
    public double getFedWithholding() {
        return getGrossPay() * 0.15;
    }

    /**
     *calculate state with holding
     * @return the result of the multiplication of state tax with gross pay
     */
    public double getStateWithholding() {
        return getGrossPay() * 0.07;
    }

    /**
     *
     * @return and prints the results for gross pay, federal withHolding , net pay,
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return super.toString() + "\nGross Pay: $" + df.format(this.getGrossPay()) + "\nFederal Withholding: $"
                + df.format(this.getFedWithholding()) + "\nState Withholding: $"
                + df.format(this.getStateWithholding()) + "\nNet Pay: $"
                + df.format(this.getGrossPay() - (this.getFedWithholding() + this.getStateWithholding()));
    }
}