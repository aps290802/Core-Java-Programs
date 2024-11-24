package Demo;
import Test.*;
class A
{
    void demo()
    {
        System.out.println("Outside package and outside class.");
    }
}
public class Pub2
{
    public static void main(String[] args)
    {
        A a1 = new A();
        Pub1 p1 = new Pub1();
        p1.show();
        a1.demo();
    }
}
