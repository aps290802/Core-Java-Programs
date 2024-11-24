class A
{
    int ans = 1;
    int fact(int a)
    {
        if(a<1)
        {
            return 1;
        }
        else
        {
            ans = ans*a;
            fact(a-1);
            return ans;
        }
    }
}
public class Demo2 
{
    public static void main(String[] args) 
    {
        A a1 =new A();
        System.out.println(a1.fact(5));
    }
}
