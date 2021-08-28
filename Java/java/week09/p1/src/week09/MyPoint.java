// Geldona Lapi
// CIT 260
// Week 9
// Project 1
// Date 6/18/2021
/**********************************
 *        UML diagram    MyPoint   *
 *---------------------------------*
 * -x: int                         *
 * -y: int                         *
 * +MyPoint()                      *
 * +MyPoint(x: int, y: int)        *
 * +distance(MyPoint: MyPoint)     *
 * +distance(x: int, y: int)       *
 * +distance(MyPoint)              *
 * +getX(): int                    *
 * +getY(): int                    *
 * +setX()                         *
 * +setY()                         *
 **********************************/



package week09;


// class MyPoint
public class MyPoint {



        //declare int variables as private
        private int x;
        private int y;

    /**
     * no-arg constructor that creates a default point at (0,0)
     */

    public MyPoint()
        {
            x=0;
            y=0;
        }


    /**
     * A member method named distance that calculates and returns the distance
     * between this MyPoint object and another point that is specified by its x- and y-coordinates.
     * @param x coordinate for a specific point
     * @param y coordinate for a specific point
     */
        public MyPoint(int x,int y)
        {
            this.x=x;
            this.y=y;
        }

        //setters and getters for instance variables

    /**
     *setter methods for x
     * @param x
     */
        public void setX(int x)
        {
            this.x=x;
        }


    /**
     *setter methods for y
     * @param y
     */
        public void setY(int y)
        {
            this.y=y;
        }
    /**
     * getter method for x
     * @return the value in the parameter x
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * getter method for y
     * @return the value in the parameter y
     */
        public int getY()
        {
            return this.y;
        }

    /**
     *
     * @param xCoord
     * @param yCoord
     * @return the distance between this MyPoint object and another
     * point that is specified by its x- and y-coordinates
     */
    public double distance(int xCoord, int yCoord)
        {
            double result=(xCoord*xCoord)+(yCoord*yCoord);
            return Math.sqrt(result);
        }

    /**
     *
      * @param p
     * @return  the distance between the MyPoint object and another object of the MyPoint class
     */
    public double distance(MyPoint p)
        {
            double result=(Math.pow(p.getX()-this.getX(),2)+Math.pow(p.getY()-this.getY(),2));
            return Math.sqrt(result);
        }

    /**
     *
      * @param mp1 first object of the MyPoint class
     * @param mp2 second object of the MyPoint class
     * @return the distance between two objects of the MyPoint class
     */


    public static double distance (MyPoint mp1, MyPoint mp2)
        {
            double result=(Math.pow(mp2.getX()-mp1.getX(),2)+Math.pow(mp2.getY()-mp1.getY(),2));
            return Math.sqrt(result);

        }
    }



