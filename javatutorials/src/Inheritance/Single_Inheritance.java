package Inheritance;
class A
{
	int fact=1, i;
	void msg()
	{
		System.out.println("Base Class");
	}
	void show(int x)
	{
		for(i=x;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Fact = "+fact);
	}
}
class B extends A
{
	int a,ans=0;
	void sum(int y)
	{
		for(a=1;a<=y;a++)
		{
			ans=ans+a;
		}
		System.out.println("Sum = "+ans);
	}
}
public class Single_Inheritance {

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.msg();
		b1.show(5);
		b1.sum(10);
	}
}
