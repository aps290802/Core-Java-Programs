import java.util.Scanner;
class A{
    int a[]= new int[6];
    void show()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Elements of Array : ");
        for(int i=0;i<5;i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("Show data");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }

}
public class Demo2 {
    public static void main(String[] args) {
        A a1 =new A();
        a1.show();
    }
}
