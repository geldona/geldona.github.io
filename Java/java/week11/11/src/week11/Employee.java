// Geldona Lapi
// CIT 260
// Week 11
// Project 1
// Date 7/02/2021
//In this class we will create:
//Design a parent class named Employee. Your Employee class should include:
//A String, name,  that holds the employee's name.
//an integer serialNumber, that holds the employee's serial number.
//A no-arg constructor that initializes name to "none" and serialNumber to 0.
//A parameterized constructor that initializes name and serialNumber using arguments passed to the constructor.
//Getters for name and serialNumber.
//A method named getGrossPay( ) that returns a zero;
//A method named getFedWithholding( ) that returns a zero.
//A method named getStateWithholding( ) that returns a zero.

/*******************************
 *  UML diagram Employee        *
 *  *****************************
 * -serialNumber:int             *
 * -name: String                 *
 * ------------------------     *
 * +employee()
 * +getName():String             *
 * +getFedWithholding():double   *
 * +getStateWithholding():double *
 * +getSerialNumber(): Int       *
 * +getGrossPay():double
 * +toString():String            *
 *******************************/



package week11;

import java.text.DecimalFormat;

public class Employee {

            private String name;
            private int serialNumber;

    /**
     *no-arg constructor that creates name =none and serial number =0
     */

            public Employee(){
                this.name="none";
                this.serialNumber=0;
            }

    /**
     * A parameterized constructor that initializes name and serialNumber using arguments passed to the constructor.
     * @param name return name of employee
     * @param serialNumber of each employee
     */
    public Employee(String name,int serialNumber){
                this.name=name;
                this.serialNumber=serialNumber;
            }

    /**
     *  a get method that gets the gross pay
     * @return zero value
     */
    public double getGrossPay(){
        return 0;
    }

    /**
     * get method that gets name
     * @return the name of the employee
     */

     public String getName(){
                return this.name;
            }

    /**
     * get method that gets the value of serial numbers
     * @return the value of serial number
     */
    public int getSerialNumber(){
                return this.serialNumber;
            }



    /**
     * get method that  gets the federal with holdings
      * @return zero value
     */
    public double getFedWithholding(){
                return 0;
            }

    /**
     * get method that get the value of the state holdings
      * @return zero value
     */
    public double getStateWithholding(){
                return 0;
            }

    /**
      *
      * @return a string value
     */
    @Override
            public String toString(){
                return "\n\nEmployee: "+this.name+" Serial: "+this.serialNumber;
            }
        }
