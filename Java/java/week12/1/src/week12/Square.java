//Geldona Lapi
//CIT 260
//Week 12, 7/10/2021

/*******************
 * Diagram Square
 * ***************
 * -side:double
 * --------------------
 * +Square(double, int)
 * +Area():double
 *********************/



package week12;

public class Square extends Form{

        private double side;

    /**
     * constructor
     * @param side of square
     * @param identifier of square
     */
        public Square(double side,int identifier){
            super(identifier);
            this.side=side;
        }

    /**
     *  function
     * @return value of Area
     */
    public double Area(){
            return Math.pow(this.side,2);
        }
}
