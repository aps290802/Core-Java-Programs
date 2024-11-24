class D extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("class A");
        }
    }
}
class E extends Thread
{
    @Override
    public void run()
    {
        super.run();
        for(int i=1;i<=5;i++)
        {
            System.out.println("class B");
        }
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        E e1 = new E();
        e1.start();
        for (int i=1;i<=5;i++)
        {
            System.out.println("class main");
        }

    }

}
