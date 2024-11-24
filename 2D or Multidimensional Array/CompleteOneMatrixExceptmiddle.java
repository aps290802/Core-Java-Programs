public class CompleteOneMatrixExceptmiddle {
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}},i,j;
        int Zero=0, One=1;
        System.out.println("Show Matrix : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix have Left Diagonal of One's");
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==1&&j==1)
                {
                    System.out.print(+Zero+"\t");
                }
                else
                System.out.print(+One+"\t");
            }
            System.out.println();
        }
    }
}
