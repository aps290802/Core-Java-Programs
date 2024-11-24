/*Program that accepts number of days as integer value and display total
number of years , months and days in it.*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int totalDays;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of days");
        totalDays = input.nextInt();

        int yrs = totalDays/365;
        int remainingDays = totalDays%365;
        int months = remainingDays/30;
        int days = remainingDays%30;

        System.out.println("Years : "+yrs);
        System.out.println("Months : "+months);
        System.out.println("Days : "+days);
    }
}