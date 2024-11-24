package Abstract_Class_and_Method;

abstract class A
{
	void show()
	{
		System.out.println("Hello");
	}
	abstract void display();
}
class B extends A
{
	void display()
	{
		System.out.println("Abstract method.");
	}
	void demo()
	{
		System.out.println("Class B");
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.show();
		b1.display();
		b1.demo();
	}
}
