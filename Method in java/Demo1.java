import java.util.Scanner;
class A 
{
    Scanner obj =new Scanner(System.in);
    void sum()
    {
        int a,b;
        System.out.println("Sum of any two numbers :");
        System.out.println("Enter any two numbers : ");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Sum = "+(a+b));
        System.out.println();
    }
    void area(int r, double pi)
    {
        System.out.println("To calculate area of circle : ");
        System.out.println("Area : "+(pi*r*r));
    }
}
public class Demo1 
{
    public static void main(String[] args) 
    {
        int r;
        double pi=3.14;
        System.out.println("Enter value of radius : ");
        Scanner sc =new Scanner(System.in);
        r = sc.nextInt();
        A a1 =new A();
        a1.sum();
        a1.area(r, pi);
    }
}
