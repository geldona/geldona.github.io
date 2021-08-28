// Geldona Lapi
// CIT 260
// Week 11
// Project 1
// Date 7/02/2021
//In this class we will create:
//Design a class named Salaried that inherits from Employee. Your Salaried class should include:
//A double, annualSalary, that holds the annual salary for this person.
//An appropriate no-arg constructor.
//An appropriate parameterized constructor.
//A Getter for salary.

/*******************************
 *  UML diagram Salaried        *
 *  *****************************
 * -annualSalary: double         *
 * ------------------------------*
 * +Salaried()
 * +getAnnualSalary():double     *
 * +getFedWithholding():double   *
 * +getGrossPay():double         *
 * +getStateWithholding():double *
 * +toString():String
 *******************************/

package week11;

import java.text.DecimalFormat;

public class Salaried extends Employee {


        private double annualSalary;
        public Salaried (){
            super();
        }

    /**
     * A member method named Salaried that calculates and returns annualSalary
     * @param name of employee
     * @param serialNumber of the employee
     * @param annualSalary value of annual salary
     */
        public Salaried(String name,int serialNumber,double annualSalary){
            super(name,serialNumber);
            this.annualSalary=annualSalary;
        }

    /**
     * a get method
     * @return annual Salary
     */
    public double getAnnualSalary(){
        return this.annualSalary;
    }

    /**
     *
     * @return  gross pay, federal withholding, state withholding
     */
        @Override
        public double getGrossPay(){return this.annualSalary/52.0;}
        public double getFedWithholding(){return getGrossPay()*0.15;}
        public double getStateWithholding(){return getGrossPay()*0.07;}

    /**
     *
      * @return and prints the output
     */
    @Override
        public String toString(){
            DecimalFormat df=new DecimalFormat("#.00");
            return super.toString()+"\nGross Pay: $"+df.format(this.getGrossPay())+"\nFederal Withholding: $"+df.format(this.getFedWithholding())+"\nState Withholding: $"+df.format(this.getStateWithholding())+"\nNet Pay: $"+df.format(this.getGrossPay()-(this.getFedWithholding()+this.getStateWithholding()));
        }
    }


