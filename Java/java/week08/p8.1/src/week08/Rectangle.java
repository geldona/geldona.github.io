// Geldona Lapi
// CIT 260
// Week 8
// Project 8.1
// Date 6/12/2021


/**************************************************
 *            *UML Class Diagram   Rectangle       *
 * ------------------------------------------------*
 * width: private double                           *
 * height: private double                          *
 * getwidth(): double                              *
 * getheight(): double                             *
 * getArea(): double                               *
 * getPerimeter(): double                          *
 ***************************************************/

package week08;

public class Rectangle {
    private double width;
    private double height;

    /**
     * the no-arg constructor
     * the parameter set height and width to 1
     */
    public Rectangle() {

        width = 1;
        height = 1;
    }
    /**
     * A constructor that creates a rectangle
     with the specified width and height    */

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    /**
     *
     * Return the height of this rectangle */

    public double getHeight() {
        return height;
    }

    /**
     *
     * Return the width of this rectangle */

    public double getWidth() {
        return width;
    }

    /**
     *
     * @return width * height
     */

    public double getArea() {
        return width * height;
    }

    /**
     *
     * Return the perimeter of this rectangle */

    public double getPerimeter() {
        return 2 * (width + height);
    }

    /**
     *
     * Return the string of this program */
    public static String getWhat()
    {
        return ("This program creates two rectangle objects and displays their width, height, area and perimeter. ");
    }
}
