import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) 
    {
        int a=0,b=1,c;
        int i,n;
        c=a+b;
        System.out.println("Plz enter the number of terms you want to print : ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        System.out.println("Fibonacci Series : ");
        System.out.println(+a);
        System.out.println(+b);
        for (i = 3; i <= n; i++) 
        {
            System.out.println(+c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
