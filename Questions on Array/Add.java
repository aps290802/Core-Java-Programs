import java.util.Scanner;
class A
{
    int size,i;
    void demo()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = obj.nextInt();
        int x[]=new int[size];
        int y[]=new int[size];
        int z[]=new int[size];
        System.out.println("Enter elements of x :");
        for(i=0;i<size;i++)
        {
            x[i]=obj.nextInt();
        }
        System.out.println("Enter elements of y :");
        for(i=0;i<size;i++)
        {
            y[i]=obj.nextInt();
        }
        for(i=0;i<size;i++)
        {
            z[i]=x[i]+y[i];
        }
        System.out.println("Show Data : ");
        for(i=0;i<size;i++)
        {
            System.out.print(z[i]+ "\t");
        }
    } 
}
public class Add 
{
    public static void main(String[] args) 
    {
        A a1 =new A();
        a1.demo();
    }
}
