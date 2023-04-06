import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    Scanner scan = new Scanner(System.in);
    Cylinder s = new Cylinder();
    int radius;
    int height;
    public void sphereInput()
    {
        System.out.print("Enter the height of Cylinder: => ");
        int h = scan.nextInt();
        System.out.print("Enter the radius of Cylinder: => ");
        int r = scan.nextInt();
        // Calling the function input for variable assignment
        Input i = new Input(r,h);
        radius = i.getLengthRadius();
        height = i.getBreadthHeight();
    }

    @Override
    public void calculateArea() {
        double area = 2 * Math.PI * radius * ( height + 2);
        System.out.print("Surface area of Cylinder is => "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * radius + 2* height;
        System.out.print("Surface area of Cylinder is => "+perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * Math.pow(radius,2)*height;
        System.out.print("Surface area of Cylinder is => "+volume);
    }
}
