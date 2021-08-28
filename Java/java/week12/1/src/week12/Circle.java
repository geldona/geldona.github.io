//Geldona Lapi
//CIT 260
//Week 12, 7/10/2021

/**********************
 * Diagram Circle
 * ********************
 * -radius: double
 * --------------------
 * +Circle(double, int)
 * +Area():double
 *
 **********************/


package week12;

public class Circle extends Form {



        private double radius;

    /**
     *
      * @param radius
     * @param identifier
     */
    public Circle(double radius,int identifier){
            super(identifier);
            this.radius=radius;
        }

    /**
     *
     * @return
     */
    public double Area(){
            return Math.PI*Math.pow(this.radius,2);
        }
    }

