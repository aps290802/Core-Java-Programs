package Test;

public class Pro1
{
    int fact=1,i;
    protected void show(int x)
    {
        for(i=x;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorail : "+fact);
    }
}


