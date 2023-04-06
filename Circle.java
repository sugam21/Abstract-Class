import java.util.*;
import java.io.*;
public class Circle extends Shape{
    Scanner scan = new Scanner(System.in);
    double r;
    @Override
    public void calculateArea() {
        System.out.print("Enter the Radius of Circle => ");
        r = scan.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        System.out.println("Area of Circle 🛞 with R = " + r + " is => " + area);
    }
    @Override
    public void calculatePerimeter()
    {
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle is => " + perimeter);

    }
}
