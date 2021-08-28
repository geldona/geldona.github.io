// Geldona Lapi
// CIT 260
// Week 10
// Project 1
// Date 6/26/2021
//The GeometricObject class
// Objects of this class represent geometric objects
// Every object has a color, and a creation date


/************************************
 * UML diagram  GeometricObject      *
 *-----------------------------------*
 * -color: String                    *
 * -dateCreated: Date                *
 * +GeometricObject()                *
 * +GeometricObject(color: String,   *
 * +getColor(): String               *
 * +setColor(color: String): void    *
 * +getDateCreated(): java.util.Date *
 * +toString(): String

 ************************************/


package week10;

// Geometry object class


import java.text.DecimalFormat;
import java.util.Date;

abstract class GeometricObject {
        private String color;
    private java.util.Date dateCreated;
        private boolean filled;


    /**
     * the parametrized
     * set the value of the object to the parameters
     * @param color as string
     * @param filled as boolean
     */
 public GeometricObject( String color,boolean filled) {
            this.color=color;
            this.filled=filled;
            this.dateCreated = new java.util.Date();
 }

    /**
     * the no-arg constructor
     * purpose: sets the date of creation of the object
     */
    public GeometricObject (){
        this.dateCreated = new java.util.Date();
    }

    /**
     * The getColor() method
     * Purpose: Return the color of the triangle
     * @return a string object containing the color of the triangle
     */

    public String getColor() {
            return color;
        }

    /**
     *the setColor() method
     * sets a value in the data member  "side"
     * @param color: the value to store
     */
    public void setColor(String color) {
            this.color = color;
        }

    /**
     * The getDateCreated() method
     * Purpose: return the date
     * @return date the object was created
     */

    public java.util.Date getDateCreated() {
        return dateCreated;
    }



    /**
     * A member method named toString( )
     * @return a String representation of the triangle object
     */
        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat("#.00");
            return "\ncreated on " + dateCreated + "\ncolor: " + color  + " and filled= "+ filled + "\nArea: "+ df.format(getArea());
        }

    /**
     * the getArea method
     * @return the value of the area
     */
        public abstract double getArea();


    }



