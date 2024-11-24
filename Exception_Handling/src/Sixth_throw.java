class D
{
    int a,b;
    D(int x, int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println(a/b);
        }
    }
}
public class Sixth_throw
{
    public static void main(String[] args)
    {
        int m=10,n=0;
        D d1 = new D(m,n);
        try
        {
            d1.show();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
