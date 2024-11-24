package Keyword;
class D
{
	D()
	{
		System.out.println("Default Constuctor");
	}
	D(int a)
	{
		this();
		System.out.println(a);
	}
}
public class Demo4 
{
	public static void main(String[] args) 
	{
		D d1 =new D(100);
	}
}
