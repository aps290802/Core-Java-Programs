import java.util.Scanner;

public class Recursion4
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("<------  Program to print table of a given number  ------> ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Please enter the number you want to print Table");
            int n = input.nextInt();
            int x =1;
            int fact = Increasing(x,n);
            System.out.println(+fact);



        }
        public static int Increasing(int x, int n)
        {
            if(x<=10) {
              int table = n*x;
              x++;
              Increasing(x,n);
            }
            return Increasing(x,n);
        }
}
