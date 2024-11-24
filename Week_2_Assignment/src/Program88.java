//Create a class to calculate Area of circle with one data member to store the
//radius and another to store area value. Create following member methods :
//1) init() : to input radius from user
//2) calc() : to calculate area
//3) display() : to display area
import java.util.Scanner;

class A
{
    // Data members
    private double radius;
    private double area;

    public void init()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    public void calc()
    {
        double pi = 3.14159;
        area = pi * radius * radius;
    }

    public void display()
    {
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
public class Program88
{
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.init();
        a1.calc();
        a1.display();
    }
}
