//Geldona Lapi
//CIT 260
//Week 12, 7/10/2021
/****************
 * Diagram Form
 * ****************
 * -identifier:int
 * ----------------------
 * +Form(int)
 * +getidentifier():int
 * abstract + Area():double
 **************************/



package week12;

abstract class Form {


        private int identifier;

    /**
     * constructor
     * @param identifier value
     */

public Form(int identifier){
        this.identifier=identifier;
    }

    /**+
     * member of function
     * @return value of the identifier
     */
        public int getIdentifier(){return this.identifier;}

    /**
     * function area
     * @return value of Area
     */
        public abstract double Area();
    }