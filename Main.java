public class Main {
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        c.stateShape("Circle");
        c.calculateArea();
        c.calculatePerimeter();

        r.stateShape("Rectangle");
        r.calculateArea();
        r.calculatePerimeter();

        s.stateShape("Square");
        s.calculateArea();
        s.calculatePerimeter();


    }
}
