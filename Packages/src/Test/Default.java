package Test;

class A
{
    void show()
    {
        System.out.println("Same package outside class.");
    }
}
public class Default
{
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.show();
    }

}
