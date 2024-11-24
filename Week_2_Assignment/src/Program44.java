import  java.util.Scanner;
public class Program44
{
    public static void main(String[] args)
    {
        int table,i;
        System.out.println("Program to print a table of a number given by a user.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number which you want to print a table :  ");
        table = input.nextInt();
        for (i=1;i<=10;i++)
        {;
            System.out.println("Table = "+(table*i));
        }
    }
}
