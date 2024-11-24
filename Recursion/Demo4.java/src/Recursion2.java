import java.util.Arrays;
import java.util.Scanner;
public class Recursion2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Please enter your number :");
        n = input.nextInt();
        greeting(n);


    }
    public static void greeting(int n)
    {
        if(n==1)
            return;
        System.out.println("Good Morning");
        greeting(n-1);
    }
}
