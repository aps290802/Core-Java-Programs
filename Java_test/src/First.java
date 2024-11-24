//Program to check whether entered year is leap year or not.

import java.util.Scanner;
public class First
{
    public static void main(String[] args)
    {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a yr to check");
        year = input.nextInt();

        if(year%4==0 || year%100==0 || year%400==0)
        {
            System.out.println("This is a leap yr.");
        }
        else
        {
            System.out.println("This is not a leap yr.");
        }

    }
}
