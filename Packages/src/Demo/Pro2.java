package Demo;
import Test.*;

public class Pro2 extends Pro1
{
    void Demo()
    {
        System.out.println("Outside packagr by using subclass.");
    }

    public static void main(String[] args)
    {
        Pro2 p2 = new Pro2();
        p2.show(6);
        p2.Demo();
    }
}
