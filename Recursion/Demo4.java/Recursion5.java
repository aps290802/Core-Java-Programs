public class Recursion5
{
    public static void main(String[] args) {
        Even a1 = new Even();
        int result = a1.show();
        System.out.println(result);
    }
}
public class Even
{
    int sum = 0;
    int show(int x)
    {
        if (x>10)
        {
            return 1;
        }
        else
        {
            if (x%2==0)
            {
                System.out.println(x)
                sum=sum+x;
            }
            else
            {
                System.out.println(x);
                sum=sum+x;
            }
            show(x+1)
        }
    }
}

