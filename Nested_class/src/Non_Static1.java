class A
{
    int a=5, fact=1, i;

    void show()
    {
        for(i=a;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial : "+fact);
    }
    class B
    {
        int a=5,sum=0,i;
        void sum()
        {
            System.out.println("To print the sum of 1 to 5 consecutive numbers : ");
            for (i=0;i<=a;i++)
            {
                sum+=i;
            }
            System.out.println("Sum = "+sum);
        }
    }
}

public class Non_Static1
{
    public static void main(String[] args)
    {
        A a1 = new A();
        A.B b1 = a1.new B();
        a1.show();
        b1.sum();
    }
}
