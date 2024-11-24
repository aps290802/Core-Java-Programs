class B
{
    int a=10,b=2;
    int arr[]={11,22,33,44,55};
    String str = "null";
    void show()
    {
        System.out.println("Program starts.....");
        try {
            System.out.println(a/b);
            System.out.println(arr[6]);
            System.out.println(str.toUpperCase());
        }
        catch (ArithmeticException a)
        {
            System.out.println("Don't div by zero.");
        }
        catch (ArrayIndexOutOfBoundsException arr)
        {
            System.out.println("Out of range.");
        }
        catch (Exception n)
        {
            System.out.println(n);
        }
        System.out.println("Program ends....");
    }
}
public class Fourth_1try$multi_catch
{
    public static void main(String[] args)
    {
        B b1 = new B();
        b1.show();
    }
}
