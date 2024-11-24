/*Print Lucas Series starting from any user entered number (up to 10 values) : 1, 2
        , 3 , 6 , 11 , 20 , 37 , ......*/
import java.util.Scanner;
public class Program55
{
    public static void main(String[] args)
    {
        int a, b, c=0, n,i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Starting term = ");
        a  = input.nextInt();
        System.out.println("Enter Second Starting term = ");
        b = input.nextInt();
        System.out.println("Enter a value you want to print series : ");
        n= input.nextInt();

        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for(i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }
}
