import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    Scanner scan = new Scanner(System.in);
    double length;
    double width;
    double height;
    public void pyramidInput()
    {
        System.out.print("Enter the height of Pyramid: => ");
        double h = scan.nextInt();
        System.out.print("Enter the lenght of Pyramid: => ");
        double l = scan.nextInt();
        System.out.print("Enter the width of Pyramid: => ");
        double w = scan.nextInt();
        // Calling the function input for variable assignment
        Input i = new Input(l,w,h);
        length = i.getLengthRadius();
        height = i.getBreadthHeight();
        width = i.getBreadth();
    }

    @Override
    public void calculateArea() {
        double area = length * width + length * (Math.sqrt(Math.pow(width/2,2)+Math.pow(height,2)))+ width * (Math.sqrt(Math.pow(length/2,2)+Math.pow(height,2)));
        System.out.println("Surface area of Cylinder is => "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 0;
        System.out.println("Surface area of Cylinder is => "+perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = (length * width * height)/3;
        System.out.println("Surface area of Cylinder is => "+volume);
    }
}
