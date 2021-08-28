// Geldona Lapi
// CIT 260
// Week 8
// Project 8.1
// Date 6/12/2021



package week08;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Rectangle.getWhat());
        Rectangle rectangle1 = new Rectangle(40 , 4);

        // Create a Rectangle with width and height
        Rectangle rectangle2 = new Rectangle(5, 3.5);


        // Display the width, height, area, and perimeter of rectangle1
        System.out.format("\nRectangle 1");
        System.out.format("\nHeight = ");
        System.out.format("%.2f",rectangle1.getWidth());

        System.out.format("\nWidth = ");
        System.out.format("%.2f",rectangle1.getHeight());

        System.out.format("\nArea = ");
        System.out.format("%.2f",rectangle1.getArea());

        System.out.format("\nPerimeter = ");
        System.out.format("%.2f",rectangle1.getPerimeter());

        //  rectangle2
        System.out.format("\n                      ");
        System.out.format("\nRectangle 2");
        System.out.format("\nHeight = ");
        System.out.format("%.2f",rectangle2.getHeight());

        System.out.format("\nWidth = ");
        System.out.format("%.2f",rectangle2.getWidth());

        System.out.format("\nArea = ");
        System.out.format("%.2f",rectangle2.getArea());

        System.out.format("\nPerimeter = ");
        System.out.format("%.2f",rectangle2.getPerimeter());

        System.out.format("\nGoodbye...");
    }
}

