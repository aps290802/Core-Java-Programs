class AB
{
    int a=10,b=0;
    int arr[] = {10,20,30,40,50};
    String name = null;
    void show()
    {
        System.out.println("Program Starts.....");
        try
        {
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println(arr[5]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println(name.toUpperCase());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program ends...");
    }
}
public class Third_try$catch
{
    public static void main(String[] args)
    {
     AB a1 = new AB();
     a1.show();
    }
}
