public class Star2 
{
    public static void main(String[] args) 
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
