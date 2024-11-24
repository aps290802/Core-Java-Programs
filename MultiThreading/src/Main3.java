class I extends Thread
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("class A");
        }
    }
}
class J extends Thread
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("class B");
        }
    }
}
public class Main3
{
    public static void main(String[] args)
    {
        I a1 = new I();
        J a2 = new J();
        a1.start();
        a2.start();
    }
}
