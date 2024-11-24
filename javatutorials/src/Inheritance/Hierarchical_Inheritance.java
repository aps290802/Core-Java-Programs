package Inheritance;
import java.util.Scanner;
class C
{
	int a,b,c;
	void Input(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
}
class D extends C
{
	void avg()
	{
		int ans = (a+b+c)/3;
		System.out.println("AVG = "+ans);
	}
}
class E extends C
{
	void sum()
	{
		System.out.println("sum = "+(a+b));
	}
}
class H extends C
{
	void sqr()
	{
		System.out.println("SQR = "+(a*a));
	}
	void cube()
	{
		System.out.println("CUBE = "+(b*b*b));
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) 
	{
		int m,n,p;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any three number : ");
		m = obj.nextInt();
		n = obj.nextInt();
		p = obj.nextInt();
		D d1 = new D();
		E e1 = new E();
		H h1 = new H();
		d1.Input(m, n, p);
		d1.avg();
		e1.Input(m, n, p);
		e1.sum();
		h1.Input(m, n, p);
		h1.sqr();
		h1.cube();
	}

}
