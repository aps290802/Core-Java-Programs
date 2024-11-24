/*Print Lucas Series starting from any user entered number (up to 10 values) : 1, 2
        , 3 , 6 , 11 , 20 , 37 , ......*/
import java.util.Scanner;

public class Second
{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any no");
    int i,n,f=0,s=1,t=2,temp=0;
    n=sc.nextInt();
    for(i=1; i<=n; i++)
    {
        System.out.print(s+"\t");
        temp=f+s+t;
        f=s;
        s=t;
        t=temp;
    }
    }
}
