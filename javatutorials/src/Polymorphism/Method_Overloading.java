package Polymorphism;
class A
{
	void show()
	{
		System.out.println("Method Overloading");
	}
	void show(int x)
	{
		System.out.println("To find a Square : "+(x*x));
	}
	void show(int r, double pi)
	{
		System.out.println("Area of a circle : "+(pi*r*r));
	}
	void show(int a, int b, int c)
	{
		System.out.println("Average of three numbers : "+(a+b+c)/3);
	}
	void show(String name)
	{
		System.out.println("My name is "+name);
	}
}
public class Method_Overloading 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.show();
		a1.show(5);
		a1.show(5, 3.14);
		a1.show(11, 22, 33);
		a1.show("Anuj Thakur");
	}
}
