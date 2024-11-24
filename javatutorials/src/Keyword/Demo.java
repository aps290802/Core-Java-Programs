package Keyword;
class A
{
	int a=100;
	void show()
	{
		System.out.println(this);
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1);
		a1.show();
	}

}
