class odd
{
    int sum_of_even =0;
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
                sum_of_even=sum_of_even+x;
//                System.out.println(y);
//                sum_of_odd=sum_of_odd+y;
            }
            show(x+1);
            return sum_of_even;

        }
    }
}
public class Recusion6
{
    public static void main(String[] args)
    {
        odd a1 = new odd();
        int result = a1.show(1);
        System.out.println("Sum of odd : "+result);

    }
}
