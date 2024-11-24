import java.util.Scanner;
class A 
{
    int a,b;
    void sum()
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Sum = "+(a+b));
        System.out.println();
    }
    void show()
    {
        System.out.println("Hello Anuj");
    }
}
public class InputMethod 
{
    public static void main(String []args)
    {
        A a1 = new A();
        a1.sum();
        a1.show();
    }
}
