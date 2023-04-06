import java.util.*;
import java.io.*;
public class Rectangle extends Shape{
    double length;
    double breadth;
    Scanner scan = new Scanner(System.in);
    @Override
    public void calculateArea()
    {
        System.out.print("Enter the length of rectangle => ");
        length = scan.nextDouble();
        System.out.print("Enter the breadth of rectangle => ");
        breadth = scan.nextDouble();

        double area = length * breadth;

        System.out.println("Area of rectangle ⏹️ is => " + area);
    }
    @Override
    public void calculatePerimeter()
    {
        double perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangel is => " + perimeter);
    }
}
