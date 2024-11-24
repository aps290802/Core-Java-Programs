class Y implements Runnable
{
    @Override
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("Class y");
        }
    }
}
public class Runnable_In
{
    public static void main(String[] args)
    {
        Y y1 = new Y();
        Thread t1 = new Thread(y1);
        t1.start();
        for (int i=1; i<=5; i++)
        {
            System.out.println("Main Thread");
        }
    }
}
