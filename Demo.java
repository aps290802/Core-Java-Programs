// Program to print the number which is given by user start to end.
import java.util.Scanner;
public class Demo {
    public static void main(String[] args)
    {
        int i, start, end;
        System.out.println("Plz Enter the start and end value to print : ");
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        if (start<end)
        {
         for (i = start; i <= end; i++) 
         {
             System.out.println(i);
         }   
        }
        else
        {
            for (i = start; i >= end; i--) 
            {
                System.out.println(i);
            }
        }
    }
    

}
