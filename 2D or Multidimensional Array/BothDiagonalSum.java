public class BothDiagonalSum 
{
    public static void main(String[] args) 
    {
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}},i,j,sum=0,leftsum=0,rightsum=0;
        System.out.println("Show matrix : ");
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    leftsum=leftsum+a[i][j];
                }
            }
        }
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i+j==2)
                {
                    rightsum=rightsum+a[i][j];
                }
            }
        }
        sum=leftsum+rightsum-a[1][1];
        System.out.println("Sum of both the diagonals without repetition: " +(leftsum+rightsum));
        System.out.println("Sum of both the diagonals with repetition : " +sum);
    }
}
