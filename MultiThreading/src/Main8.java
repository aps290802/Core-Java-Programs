class A extends Thread
{
    public void run()
    {
        System.out.println("Class A");
    }
}

public class Main8 {
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.start();
        a1.suspend();
        a1.resume();
        for (int i=1;i<=5;i++)
        {
            System.out.println("Main class");
        }

    }
}
