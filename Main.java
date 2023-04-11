import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Circle cir = new Circle();
        Rectangle rec = new Rectangle();
        Square squ = new Square();
        Cylinder cyl = new Cylinder();
        Pyramid pyr = new Pyramid();
        Sphere sph = new Sphere();

        cir.stateShape("Circle");
        cir.calculateArea();
        cir.calculatePerimeter();

        rec.stateShape("Rectangle");
        rec.calculateArea();
        rec.calculatePerimeter();

        squ.stateShape("Square");
        squ.calculateArea();
        squ.calculatePerimeter();

        cyl.stateShape("Cylinder");
        cyl.cylinderInput();
        cyl.calculateArea();
        cyl.calculatePerimeter();
        cyl.calculateVolume();

        pyr.stateShape("Pyramid");
        pyr.pyramidInput();
        pyr.calculateArea();
        pyr.calculatePerimeter();
        pyr.calculateVolume();


        sph.stateShape("Sphere");
        sph.sphereInput();
        sph.calculateArea();
        sph.calculatePerimeter();
        sph.calculateVolume();


    }
}
