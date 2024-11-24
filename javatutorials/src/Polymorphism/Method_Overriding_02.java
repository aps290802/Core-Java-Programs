package Polymorphism;
// With Inheritance
class G
{
	int fact = 1,i;
	void show(int x)
	{
		for(i=x;i>=1;i--)
		{
			fact = fact * i;
//			System.out.print(fact*);
		}
		System.out.println("Factorial : " +fact);
	}
}
class F extends G
{
	void show(int a)
	{
		super.show(5);
		System.out.println("Table of "+a);
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i*a);
		}
	}
}
class S extends F
{
	void show(int n)
	{
		super.show(11);
		System.out.println("Squares upto number this : "+n);
		for (int i=1; i<=n; i++) 
		{
			System.out.println(i*i);
		}
	}
}
public class Method_Overriding_02 
{
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.show(6);
	}

}
