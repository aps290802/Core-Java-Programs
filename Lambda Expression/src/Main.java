interface A
{
    void show();
}
public class Main {
    public static void main(String[] args)
    {
        A a1 = () ->
        {
            System.out.println("Lambda Expression");
        };
        a1.show();
    }
}