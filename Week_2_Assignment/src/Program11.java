import java.util.Scanner;
// Program to reverse a number
public class Program11
{
    public static void main(String[] args)
    {
        int num, reverse=0, rem;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number that you want to reverse = ");
        num= obj.nextInt();

        while(num!=0)
        {
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("The reversed number is : "+reverse);
    }
}
