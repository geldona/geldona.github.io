//Geldona Lapi
//CIT 260
//Week 12, 7/10/2021
//Create the following objects and store the references to them in a single ArrayList.
//A Circle object with a radius of 10 inches and an identifier of 156.
//A Square object with a side of 2 inches and an identifier of 237.
//A  Right Triangle with a height of 3 inches, a base of 4 inches and an identifier of 212.

package week12;

import java.util.ArrayList;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {

        // create array list
        ArrayList<Form>list=new ArrayList();


        Form obj1=new Circle(10,156);
        Form obj2=new Square(2,237);
        Form obj3=new RightTriangle(3,4,212);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        // Print table information

        System.out.format("Identifier Area\n");
        for (Form form : list) {
            DecimalFormat df=new DecimalFormat("#.00");
            System.out.format(" \n" + form.getIdentifier() + "  " + df.format(form.Area()) + " sq. inches");
        }
        System.out.format("\nGoodbye...");

    }
}