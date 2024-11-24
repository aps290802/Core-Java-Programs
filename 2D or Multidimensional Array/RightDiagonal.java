public class RightDiagonal 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}}, i, j, sum=0;
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
                if(i+j==2)
                {
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println("sum = " +(sum));
    }
}
