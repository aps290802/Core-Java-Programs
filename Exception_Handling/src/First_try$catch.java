class A
{
    int a=10,b=0;
    void show()
    {
        System.out.println("Program starts......");
        try
        {
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program ends.....");
    }
}
public class First_try$catch
{
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.show();
    }
}
