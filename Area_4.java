import java.io.*;
import java.util.*;
abstract class Shape
{
    double a = 0.0, b = 0.0;
    abstract public void printArea();
}
class Rectangle extends Shape
{
    double area = 0.0;
    public void printArea()
    {
        System.out.println("Area of Rectangle");
        System.out.println("----------");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Width:");
        this.a = in.nextDouble();
        System.out.println("Enter the Length:");
        this.b = in.nextDouble();
        this.area = a*b; /* (width*length) */
        System.out.println("The area of rectangle is:"+this.area);
    }
}
class Triangle extends Shape
{
    double area = 0.0;
    public void printArea()
    {
        System.out.println("-----Area of Triangle-----");
        System.out.println("----------");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Base:");
        this.a = in.nextDouble();
        System.out.println("Enter the Height:");
        this.b = in.nextDouble();
        this.area = 0.5*a*b; /* 1/2 (base*height) */
        System.out.println("The area of triangle is:"+this.area);
    }
}
class Circle extends Shape
{
    double area = 0.0;
    public void printArea()
    {
        System.out.println("-----Area of Circle-----");
        System.out.println("----------");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        this.a = in.nextDouble();
        this.area = 3.14*a*a; /* 3.14*r*r */
        System.out.println("The area of circle is:"+this.area);
    }
}
public class Area_4
{
    public static void main(String[] args)
    {
        System.out.println("-----Finding the Area of Shapes:-----");
        Shape s;
        s=new Rectangle();
        s.printArea();
        s=new Triangle();
        s.printArea();
        s=new Circle();
        s.printArea();
    }
}