class AA
{
    int a=10,b=2;
    int arr[] = {11,22,33,44,55}, i;
    String name = null;
    void show()
    {
        try
        {
            System.out.println("Program Starts...");
            System.out.println(a/b);
            System.out.println(arr[5]);
            System.out.println(name.toUpperCase());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program ends....");
    }
}
public class Second_try$catch
{
    public static void main(String[] args)
    {
        AA a2 = new AA();
        a2.show();
    }
}
