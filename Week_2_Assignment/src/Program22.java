import java.util.Scanner;
//Program to check a leap year or not.
public class Program22
{
    public static void main(String[] args)
    {
        int year;
        System.out.println("Program to check a leap year or not.");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a year you want to check : ");
        year=input.nextInt();
        if((year%4==0) || (year%100==0) || (year%400==0))
        {
            System.out.println("It is a leap year.");
        }
        else
        {
            System.out.println("Not a leap year.");
        }
    }
}

