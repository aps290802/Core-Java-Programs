import java.util.Objects;

class B
{
    public synchronized void table(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
class Thread1 extends Thread
{
    B a1;
    Thread1(B a1)
    {
        this.a1=a1;
    }
    public void run()
    {
        a1.table(5);
    }
}
class Thread2 extends Thread
{
    B a2;
    Thread2(B a2)
    {
        this.a2=a2;
    }
    public void run()
    {
        a2.table(7);
    }
}
public class Main9
{
    public static void main(String[] args)
    {
        B obj = new B();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
