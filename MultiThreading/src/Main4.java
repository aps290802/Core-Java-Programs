class K extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("class K");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        { }
    }
}
public class Main4
{
    public static void main(String[] args) throws Exception
    {
        K a1 = new K();
        a1.start();
        for(int i=1; i<=5; i++)
        {
            System.out.println("Main Thread");
            a1.sleep(2000);
        }
    }
}
