public class FourbyFourMatrix4
{
    public static void main(String[] args) 
    {
        int a[][]=new int[4][4];
        int i,j;
        // int Zero=0, One=1;
        System.out.println("Show Matrix : ");
        for (i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(j==0||j==2)
                {
                    a[i][j]=1;
                }
                else
                a[i][j]=0;
            }
        }
        for (i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
             System.out.print(a[i][j]+"\t");   
            }
            System.out.println();
        }
    } 
    
}
