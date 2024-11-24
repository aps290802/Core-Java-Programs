import java.util.Scanner;

public class Arraysearching {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,89,56,10};
        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the numnber you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(a, num);
        if(isFound)
        {
            System.out.println("Your number was found in the array");
        }
        else
        {
            System.out.println("Your number was not found in the array");
        }

    }
    public static boolean isFound(int a[], int num)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                return true;
            }
        }
        return false;
    }


}
