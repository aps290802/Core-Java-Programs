import java.util.Scanner;
public class Program3 
{
    public static void main(String[] args) 
    {
        /*Program to calculate simple interest. (Take input from keyboard via Scanner class object) */
        double princpal,rate,time;
        double si;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter pricipal");
        princpal=obj.nextDouble();
        System.out.println("Enter rate");
        rate=obj.nextDouble();
        System.out.println("Enter time (in yrs)");
        time=obj.nextDouble();
        si=(princpal*rate*time)/100;
        System.out.println("Simple interest = "+si);
        
    }
}
