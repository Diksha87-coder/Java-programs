// WAP create a Rectangle class in Java, define methods to read the 
// length and width, calculate the area of the rectangle, and display 
// its length, width, and area.
/* 
import java.util.Scanner;
 class AreaRectangle {

    int length, width, area;

    void readData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = sc.nextInt();

        System.out.print("Enter the width: ");
        width = sc.nextInt();
    }

    void calculateArea() {
        area = length * width;
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        AreaRectangle obj = new AreaRectangle();

        obj.readData();
        obj.calculateArea();
        obj.display();
      
    }
}*/


// WAP to create a Square class in Java, define methods to read the side 
// of the square, calculate its area, and display the side and area.

import java.util.Scanner;
public class AreaSquare {
    int side, area;
    // Function to read side
    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        side = sc.nextInt();
    }
    // Function to calculate area
    void calculateArea() {
        area = side * side;
    }
    // Function to display result
    void display() {
        System.out.println("Side = " + side);
        System.out.println("Area = " + area);
    }
    public static void main(String[] args) {

        AreaSquare obj = new AreaSquare();

        obj.readData();
        obj.calculateArea();
        obj.display();
    }
}

