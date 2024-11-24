import java.util.Scanner;
class BA
{
    int a,b;
    BA(int x, int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println("Program starts....");
        try
        {
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Active the finally Block.");
        }
    }
}
public class Fifth_Finally
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        m = input.nextInt();
        n = input.nextInt();
        BA b1 = new BA(m,n);
        b1.show();
    }
}
