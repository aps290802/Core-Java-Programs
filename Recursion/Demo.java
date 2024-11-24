class A
{
    void show()
    {
        System.out.println("Hello");
        show();
    }
}
public class Demo {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
    }
}
