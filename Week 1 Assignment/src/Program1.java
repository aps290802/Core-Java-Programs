public class Program1 
{
    /*Program to find area and circumference of a circle. (Use Fixed Data , Do
not take values from user)*/

    public static void main(String []args)
    {
        System.out.println("Program to find area and circumference of a circle ");
        double radius=5, pi=3.14;
        double area, circumference;
        area= pi*radius*radius;     
        System.out.println("Area of a circle = "+area); 
        circumference=2*pi*radius;    
        System.out.format("Circumference of circle = %.2f",circumference);
       
    }
}


