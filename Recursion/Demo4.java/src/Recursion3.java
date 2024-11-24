import java.util.Scanner;
public class Recursion3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("<------  Program to print Decreasing order of a  Start to end number. ------> ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Please enter the number you want to start decreasing");
        int x = input.nextInt();
        System.out.println("Please enter the number till you want to finish decreasing");
        int n = input.nextInt();
        Increasing(x,n);
    }
    public static void Increasing(int x, int n)
    {
        if(x<=n) {
            return ;
        }
        x--;
        System.out.println(+x);
        Increasing(x,n);
        return;


    }
}
