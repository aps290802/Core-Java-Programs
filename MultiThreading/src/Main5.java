class AA extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("class AA");
        }
    }
}
class BB extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("class BB");
        }
    }
}
public class Main5
{
    public static void main(String[] args) throws Exception
    {
        AA a1= new AA();
        BB b1= new BB();
        a1.start();
        a1.join();
        b1.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Thread.");
        }

    }

}
