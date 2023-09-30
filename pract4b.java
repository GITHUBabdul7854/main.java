interface Shape
{
    double area();
     double perimeter();
}
class Circle implements Shape
{
    private double radius;
    public Circle(double radius)
{
    this.radius=radius;
}
public double area()
{
    return Math.PI*radius*radius;
}
public double perimiter()
{
    return 2*Math.PI*radius;
   }
}
class Rectangle implements Shape
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
{
     this.width=width;
     this.height=height;
}
public double area()
{
    return width*height;
}
public double perimiter()
{
    return 2*(width+height);
  }
}
class Main
{
   public static void main(String[] args)
{
    Circle circle=new Circle(5);
    System.out.println("Circle area: "+circle.area());
    System.out.println("Circle perimeter: "+circle.perimeter());
    Rectangle rectangle=new Rectangle(4,6);
    System.out.println("Rectangle area: "+rectangle.area());
    System.out.println("Rectangle perimeter: "+rectangle.perimeter());
   }
}
