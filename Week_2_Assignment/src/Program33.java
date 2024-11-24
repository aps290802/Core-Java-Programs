import java.util.HashMap;
import java.util.Scanner;
public class Program33
{
    public static void main(String[] args)
    {
        double basic_salary, HRA=0, DA=0, Total_Salary=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter basic salary of an employee");
        basic_salary = input.nextDouble();

        /*If basic salary of empoyee is less than Rs. 1500 , then HRA = 10% of basic salary and DA = 90 % of basic salary */
        if (basic_salary<1500)
        {
            HRA = 0.1*basic_salary;
            DA= 0.9*basic_salary;
        }
        /*If basic salary is greater tahn or equal to Rs. 1500 , then HRA = Rs. 500 and DA = 98% of basic salary */
        else
        {
            HRA= 500;
            DA = 0.98*basic_salary;
        }

        System.out.println("Basic Salary : "+basic_salary);
        System.out.println("HRA : " +HRA);
        System.out.println("DA : " +DA);

        Total_Salary = basic_salary+HRA+DA;

        System.out.println("Total Salary of a Employee : "+Total_Salary);
    }
}
