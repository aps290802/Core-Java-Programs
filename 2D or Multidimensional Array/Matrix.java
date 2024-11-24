public class Matrix 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}},i,j;
        System.out.println("Show Matrix : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
