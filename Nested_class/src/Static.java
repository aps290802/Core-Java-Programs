class P
{
    static int A = 10,i;
    static void sum()
    {
        int ans=0;
        for(i=1;i<=A;i++)
        {
            ans+=i;
        }
        System.out.println("Sum of first 10 numbers is : "+ans);
    }
    static class Q
    {
        int b=5,i,result=1;
        void fact()
        {
            for(i=b;i>=1;i--)
            {
                result*=i;
            }
            System.out.println("Factorial : "+result);
        }
    }
}
public class Static
{
    public static void main(String[] args)
    {
        P.Q p1=new P.Q();
        P.sum();
        p1.fact();


    }
}
