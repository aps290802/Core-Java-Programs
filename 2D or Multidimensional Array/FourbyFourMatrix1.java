public class FourbyFourMatrix1 {
    public static void main(String[] args) 
    {
        int a[][]=new int[4][4];
        int i,j;
        System.out.println("Show Matrix : ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {if(j==0||j==1)
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
