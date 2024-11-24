import java.util.Scanner;
public class Recursion {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial generator");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.print("Factorial of your number is : " +fact);
    }
    public static long factorial(int num)
    {
        if (num==1)
        {
            return 1;
        }
        return num*factorial(num-1);
    }
//    public static long facotialIterator(int num)
//    {
//        long result = 1;
//        for (int i=1; i<=num;i++)
//        {
//            System.out.println("F or which number it runs : " +i);
//            result *= i;
//        }
//        return result;
//    }

}
