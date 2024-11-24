class V extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("V class");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        { }
    }
}
public class Main10
{
    public static void main(String[] args)
    {
        V v1 = new V();
        v1.start();
        v1.interrupt();
    }
}
