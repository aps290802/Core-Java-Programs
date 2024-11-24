// Program to print alphabets(a to z).
import java.util.Scanner;
public class Alpha 
{
    public static void main(String[] args) 
    {
        char str;
        int i;
        System.out.println("Enter any character");
        Scanner obj = new Scanner(System.in);
        str = obj.next().charAt(0);
        for (i = 1; i <= 26; i++) {
            System.out.print(str+",");
            str++;
        }
    }
}