class  Even
{
    int sum =0;
    int show(int x)
    {
        if(x>10)
        {
            return 1;
        }
        else
        {
            if (x%2==0)
            {
                System.out.println(x);
                sum=sum+x;
            }
            show(x+1);
            return sum;
        }
    }
}
public class Recursion5
{
    public static void main(String[] args)
    {
        Even e1 = new Even();
        int result=e1.show(1);
        System.out.println("Sum : "+result);
    }
}
