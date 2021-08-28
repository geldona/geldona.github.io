// Geldona Lapi
// CIT 260
// Week 10
// Project 1
// Date 6/26/2021
//The Triangle class
// Objects of this class represent  triangles
// Every triangle has a color , three side and a filled attribute

/*********************************************************
 *  UML diagram          Triangle                         *
 *--------------------------------------------------------*
 * -side1                                                 *
 * -side2                                                 *
 * -side3
 * -------------------------------------------------------*
 * +Triangle()                                            *
 * +Triangle(double side1, double side2, double side3)    *
 * +getSide1(): double                                    *
 * +getSide2(): double                                    *
 * +getSide3(): double
 * +setSide1(side1: double): void
 * +setSide2(side2: double): void
 * +setSide3(side3: double): void
 * +getArea(): double                                     *
 * +getPerimeter(): double                                *
 * +toString(): String
 * super()                                               *
 *********************************************************/

package week10;



class Triangle extends GeometricObject {

        // Three data fields side1, side2, and side3 that represent sides of a triangle.
        private double side1;
        private double side2;
        private double side3;



    //Getter and setter methods for side1, side2, and side3.

    /**
     * The getSide method gets the side 1 of the triangle
     * @return the value
     */
        public double getSide1() {
            return side1;
        }

    /**
     *The getSide method gets the side 2 of the triangle
     * @return value
     */
    public double getSide2() {
            return side2;
        }

    /**
     *The getSide method gets the side 3 of the triangle
     * @return value
     */

    public double getSide3() {
            return side3;
        }

    /**
     * the setSide method
     * sets a value in the data member  "side"
     * @param side1: the value to store
     */
    public void setSide1(double side1) {
            this.side1 = side1;
        }

    /**
     * the setSide method
     * sets a value in the data member  "side"
     * @param side2 : the value to store
     */
        public void setSide2(double side2) {
            this.side2 = side2;
        }

    /**
     * the setSide method
     * sets a value in the data member  "side"
     * @param side3 : the value to store
     */
        public void setSide3(double side3) {
            this.side3 = side3;
        }


    /**
     * A no-arg constructor
     * Purpose: Creates a default triangle with each side equal to 1.
     *
     */
    public Triangle()
        {
            side1=1.0;
            side2=1.0;
            side3=1.0;

        }

        /**
         * Parameterized constructor that creates a triangle with specified values for side1, side2, and side3
         * @param side1 of triangle
         * @param side2 of triangle
         * @param side3 of triangle
         */

        public Triangle(double side1, double side2, double side3, String color, boolean filled) {
            super(color, filled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        }
//A member method named getArea( ) that calculates and returns the area of the triangle.
        /**
         * side1 first side of the triangle
         * side2 second side of the triangle
         * side3 third side of the triangle
         *@return the area of the triangle  by using the formula;
         */
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));

        }


         /**
          * A member method named toString( )
          *return a String representation of the triangle object
          */
        @Override
        public String toString() {

            return "side1= " + side1 + ", side2= " + side2 + ", side3= " + side3 + " " + super.toString();
        }
    }




