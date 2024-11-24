class C extends Thread
{
    public void run()
    {
        System.out.println("class C");
    }
}
public class Main6
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.start();
        System.out.println("Main Thread.");

    }
}
