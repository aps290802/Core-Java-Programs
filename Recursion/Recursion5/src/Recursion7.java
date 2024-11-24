import java.util.Scanner;
class A
{
    int a[]= new int[5];
    Scanner input = new Scanner(System.in);
    int Arrayin(int x)
    {
        if (x>=5)
        {
            return 1;
        }
        else
        {
            System.out.println("Enter value of a");
            a[x] = input.nextInt();
            Arrayin(x+1);
            return 0;
        }
    }
    int Arrayout(int y)
    {
        if(y>=5)
        {
            return 1;
        }
        else
        {
            System.out.println(a[y]);
            Arrayout(y+1);
            return 0;
        }

    }
}
public class Recursion7
{
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.Arrayin(0);
        a1.Arrayout(0);
    }
}
