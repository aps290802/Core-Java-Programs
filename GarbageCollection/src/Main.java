class A
{
    A()
    {
        System.out.println("Memory is Allocated.");
    }
    void show()
    {
        System.out.println("Working of object.");
    }
    @Override
    protected void finalize()
    {
        System.out.println("Memory is De-allocated.");
    }
}
public class Main {
    public static void main(String[] args) throws Exception
    {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        a1.show();
        a2=null;
        a3=null;
        System.gc();
    }
}