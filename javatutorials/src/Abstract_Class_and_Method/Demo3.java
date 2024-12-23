package Abstract_Class_and_Method;

import java.util.Scanner;
abstract class First
{
	abstract void fact(int x);
	abstract void table(int y);
	abstract void sum(int x,int y);
	abstract void sqr(int x);
}
abstract class Second extends First
{
	int i,ans=1;
	void fact(int x)
	{
		for(i=x;i>=1;i--)
		{
			ans=ans*i;
		}
		System.out.println("Factorial = "+ans);
	}
	void table(int y)
	{
		System.out.println("To print table of "+y);
		for(i=1;i<=10;i++)
		{
			System.out.println(y*i);
		}
	}
}

abstract class Third extends Second
{
	@Override
	void sum(int a,int b)
	{
		System.out.println("Sum ="+(a+b));
	}
}
class Fourth extends Third 
{
	void sqr (int y)
	{
		System.out.println("Square = "+(y*y));
	}
}

public class Demo3 
{
	public static void main(String[] args) 
	{
		int p,q;
		System.out.println("Enter 2 numbers =");
		Scanner obj = new Scanner(System.in);
		p=obj.nextInt();
		q=obj.nextInt();
		Fourth d1 = new Fourth();
		d1.sqr(q);
		d1.table(p);
		d1.sum(p, q);
		d1.fact(q);
	}
}
