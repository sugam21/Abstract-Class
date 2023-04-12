# Abstract-Class
## SHAPES
It consists of 10 class files viz Main, Input, Volume, Shape, Circle, Cylinder, Pyramid, Rectangle, Sphere, Square.<br>
1. Volume.java is an interface class which consists of calculateVolume function.<br>
2. Input.java class consists of 3 private variable lengthRadius, breadthHeight, and height. It consists of 3 constructor with 1 variable, 2 variables and 3 variables<br>
3. Shape.java class is an <b>abstract</b> class which consists of <br>
  a. stateShape --> This function takes shape as input string  and prints out the shape . <br>
  b. calculateArea --> This is an abstract class which is used to calculate Area of the shapes.<br>
  c. calculatePerimeter --> This is also an abstract class which is used to calculate the Perimeter of shapes.<br>
4.  Circle.java --> This class extends Shape class and overrides calculateArea and calculatePerimeter to calculate the Area and Perimeter of Circle. <br>
5. Cylinder.java --> This class extends Shape class and implements Volume class and overrides calculateArea and calculatePerimeter and calculateVolume to calculate the Area, Perimeter and Volume of Cylinder. <br>
5.  Pyramid.java --> This class extends Shape class and implements Volume class and overrides calculateArea and calculatePerimeter and calculateVolume to calculate the Area, Perimeter and Volume of Pyramid. <br>
6. Rectangle.java --> This class extends Shape class and overrides calculateArea and calculatePerimeter to calculate the Area and Perimeter of Rectangle. <br>
7. Sphere.java --> This class extends Shape class and implements Volume class and overrides calculateArea and calculatePerimeter and calculateVolume to calculate the Area, Perimeter and Volume of Sphere. <br>
8. Square.java --> This class extends Shape class and overrides calculateArea and calculatePerimeter to calculate the Area and Perimeter of Square. <br>
