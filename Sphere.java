import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    Scanner scan = new Scanner(System.in);
    double radius;
    public void sphereInput()
    {
        System.out.print("Enter the radius of Sphere: => ");
        double r = scan.nextInt();
        Input i = new Input(r);
        radius = i.getLengthRadius();
    }

    @Override
    public void calculateArea() {
        double area = 3 * Math.PI * Math.pow(radius,2);
        System.out.println("Surface area of Sphere is => "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Surface area of Sphere is => "+perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = (4/3) * Math.PI * Math.pow(radius,3);
        System.out.println("Surface area of Sphere is => "+volume);
    }
}
