public class Input {
    private double lengthRadius;
    private double breadthHeight;
    private double height;


    // This is a constructor for Circle and Sphere
    // Rectangle, Square, Sphere, Cylinder, and Pyramid.
public Input(double lengthRadius)
{
    this.lengthRadius = lengthRadius;
}
    // This is a constructor for rectangle
public Input(double length, double breadthHeight)
{
    this(length);
    this.breadthHeight = breadthHeight;
}
public Input(double length, double breadth, double height )
{
    this(length,breadth);
    this.height=height;

}
    public double getBreadth() {
        return breadthHeight;
    }

    public void setBreadth(int breadth) {
        this.breadthHeight = breadth;
    }

    public double getBreadthHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.breadthHeight = height;
    }

    public double getLengthRadius() {
        return lengthRadius;
    }

    public void setLengthRadius(int lengthRadius) {
        this.lengthRadius = lengthRadius;
    }

}
