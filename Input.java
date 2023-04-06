public class Input {
    private int lengthRadius;
    private int breadth;
    private int height;


    // This is a constructor for Circle and Sphere
    // Rectangle, Square, Sphere, Cylinder, and Pyramid.
public Input(int lengthRadius)
{
    this.lengthRadius = lengthRadius;
}
    // This is a constructor for rectangle
public Input(int length, int breadth)
{
    this(length);
    this.breadth = breadth;
}
public Input(int length, int breadth, int height )
{
    this(length,breadth);
    this.height=height;

}
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLengthRadius() {
        return lengthRadius;
    }

    public void setLengthRadius(int lengthRadius) {
        this.lengthRadius = lengthRadius;
    }

}
