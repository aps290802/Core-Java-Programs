

/*Program to calculate sum of marks of 3 subjects and find percentage marks.(Take input via command line arguments) */
public class Program2 
{
    public static void main(String[] args) 
    {
        System.out.println("Program to calculate sum of marks of 3 subjects and find percentage marks.(Take input via command line arguments) ");
        System.out.println();
        int a,b,c,sum=0;
        double per;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        sum=a+b+c;
        System.out.println("Sum of Marks  = "+sum);
        per = (a+b+c)/3;
        System.out.println("Percentage of Marks  = "+per+"%");
    }
    
}
