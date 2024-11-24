class A1
{
    int a=100;
    void show()
    {
        System.out.println("Outer class Method");
    }
    class B1
    {
        static int b=100;
        static void demo()
        {
            System.out.println("Inner class static Method");
        }
    }
}

public class Non_static2
{
    public static void main(String[] args)
    {
        A1 a1 = new A1();
        System.out.println(a1.a);
        a1.show();
        System.out.println(A1.B1.b);
        A1.B1.demo();

    }
}
