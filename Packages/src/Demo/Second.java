package Demo;
import Test.*;
import java.util.Scanner;
class Transpose
{
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}, i, j;
    int transpose[][] = new int[3][3];
    void twoD()
    {
        for (i=0;i< transpose.length;i++)
        {
            for (j=0;j< transpose.length;j++)
            {
                transpose[i][j]=arr[j][i];
            }
        }

        System.out.println();
        System.out.println("Show 2d Array");
        for(i=0;i< arr.length;i++)
        {
            for(j=0;j< arr.length;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transpose matrix");
        for(i=0;i< arr.length;i++)
        {
            for(j=0;j< arr.length;j++)
            {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
class Reverse
{
    int a[] ={13,15,17,21,25}, i, temp=0;
    void show()
    {
        System.out.println();
        System.out.println("To print the reverse array : ");
        System.out.println("Show Array");
        for (i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    void rev()
    {
        for (i=0;i<a.length/2;i++)
        {
            temp=a[i];
            a[i]=a[4-i];
            a[4-i]=temp;
        }
        System.out.println();
        System.out.println("Show Reversed");
        for (i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
public class Second
{
    public static void main(String[] args)
    {
        int m,n,o;
        Scanner input = new Scanner(System.in);
        First f1 = new First();
        Reverse r1 = new Reverse();
        Transpose t1 = new Transpose();

        System.out.println("Enter a value to calculate factorial : ");
        m = input.nextInt();
        int fact = f1.Factorial(m);
        if (fact%2==0)
            System.out.println("Factorial is even");
        else
            System.out.println("Factorial is odd.");

        System.out.println("Enter a number which you to print a table : : ");
        n = input.nextInt();
        f1.Table(n);

        System.out.println("Enter the size of row to print a star triangle : ");
        o = input.nextInt();
        f1.starTriangle(o);

        r1.show();
        r1.rev();

        t1.twoD();
    }
}
