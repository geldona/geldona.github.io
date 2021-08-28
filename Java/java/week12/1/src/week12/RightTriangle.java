//Geldona Lapi
//CIT 260
//Week 12, 7/10/2021
/**********************
 * RightTriangle diagram
 * --------------------
 * -height:double
 * -base:double
 * ----------------------
 * +RightTriangle(double, int)
 * +Area():double
 *****************************/
package week12;

public class RightTriangle extends Form {

        private double height,base;

    /**
     * constructor
     * @param height of triangle
     * @param base of triangle
     * @param identifier of triangle
     */
        public RightTriangle(double height,double base,int identifier){
            super(identifier);
            this.height=height;
            this.base=base;
        }

    /**
     *
     * @return value of Area
     */
    public double Area(){
            return 0.5*this.height*this.base;
        }
    }

