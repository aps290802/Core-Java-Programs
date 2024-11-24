public class Alphabetmatrix 
{
    public static void main(String[] args) 
    {
        char ch[][]={{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        int i,j;
        System.out.println("Show Matrix : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(ch[i][j] +"\t");
            }
            System.out.println();
        }
    }    
}
