public class Number9th 
{
    public static void main(String[] args) 
    {
        
        for(int i=1;i<=8;i++)
        {
            if (i%2!=0) 
            {
                for(int j = 1; j<=8-i+1; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            else
            {
                for(int j=8-i+1;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }      
}

