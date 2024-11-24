class G extends Thread
{
    public void run()
    {
        System.out.println("Hello, Big Boss ");
    }
}
class H extends Thread
{
    public void run()
    {
        System.out.println("Bye.");
    }
}
public class Main7
{
    public static void main(String[] args)
    {
        G g1 = new G();
//        H h1 = new H();
        g1.start();
        g1.stop();
//        h1.start();
//        h1.stop();
    }
}
