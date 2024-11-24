class a
{
    void show(char i)
    {
        if(i<='z')
        {
            show(i+1);
        }
        System.out.println(i);
    }
    // char str;
    // int ans = 1;
    // int fact(int a)
    // {
    //     if(a<1)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         ans = ans*a;
    //         fact(a-1);
    //         return ans;
    //     }
    // }
}
public class Demo3 
{
    public static void main(String[] args) 
    {
        char i = 'a';
        
        A a1 =new A();
        System.out.println(a1.fact(26));
    }
}
