class Any extends Thread
{
    @Override
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("class A");
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Any a1 = new Any();
        a1.start();
        for(int i=1; i<=5 ; i++)
        {
            System.out.println("Main thread");
        }
    }
}