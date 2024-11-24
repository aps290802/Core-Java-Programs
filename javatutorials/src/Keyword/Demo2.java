package Keyword;
class B
{
	int a =10;
	B(int a)
	{
//		this.a=a;
		System.out.println("Local : "+a);
		System.out.println("Non-Static : "+this.a);
	}
}
public class Demo2 
{
	public static void main(String[] args) 
	{
		B b1 = new B(100);
	}
}
