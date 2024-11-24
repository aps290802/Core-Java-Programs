package Constructor;
import java.util.Scanner;
class AA
{
	int a,b;
	AA(int x, int y)
	{
		a=x;
		b=y;
	}
	void sum()
	{
		System.out.println("Sum : "+(a+b));
	}
	void sqr()
	{
		System.out.println("SQR : "+(a*a));
	}
	void cube()
	{
		System.out.println("CUBE : "+(b*b*b));
	}
}
public class Demo3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int m,n;
        System.out.println("Please enter any two numbers : ");
        Scanner obj = new Scanner(System.in);
        m = obj.nextInt();
        n = obj.nextInt();
        AA a1 = new AA(m,n);
        a1.sum();
        a1.sqr();
        a1.cube();
	}

}
