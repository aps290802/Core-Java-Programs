
import java.util.Scanner;

public class MatrixInput 
{
    public static void main(String[] args) 
    {
        int a[][] = new int[3][4];
        int i,j;
        System.out.println("Enter value of matrix");
        Scanner obj =new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("Show matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }        
    }
}
