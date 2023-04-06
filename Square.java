import java.util.*;
import java.io.*;
public class Square extends Shape{
    double length;
    Scanner scan = new Scanner(System.in);

    @Override
    public void calculateArea()
    {
        System.out.print("Enter the length of Square => ");
        length = scan.nextDouble();
        double area = length*length;
        System.out.println("Area of square ⏺️ is => " + area);

    }
    @Override
    public void calculatePerimeter()
    {
        double perimeter = 4 * length;
        System.out.println("Perimeter of square is => " + perimeter);
    }
}
