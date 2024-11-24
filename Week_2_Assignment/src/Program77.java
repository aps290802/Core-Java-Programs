public class Program77
{
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{9,8,7},{6,5,4},{3,2,1}},i,j;
        int c[][]=new int[3][3];
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                c[i][j]=0;
                int k;
                for(k=0; k<3; k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("/n show data");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
