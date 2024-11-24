package Keyword;
class C
{
	C()
	{
		this(10);
		System.out.println("Default Constructor");
	}
	C(int a)
	{
		System.out.println(a);
	}
}
public class Demo3 
{
	public static void main(String[] args) 
	{		
		C c1 = new C();
	}
}
