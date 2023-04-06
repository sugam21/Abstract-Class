abstract public class Shape
{
    public void stateShape(String shape)
    {
        System.out.println("The shape is : " + shape);
        System.out.println("**********************************");
    }
    abstract public void calculateArea(); //It is an abstract method
    abstract public void calculatePerimeter();
}
