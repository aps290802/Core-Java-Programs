package Polymorphism;
class B
{
	void show()
	{
		System.out.println("Class A");
	}
}
class C extends B
{
	void show()
	{
		super.show();
		System.out.println("Class B");
	}
}
public class Method_Overridng 
{
	public static void main(String[] args) 
	{
		C c1 =new C();
		c1.show();
	}

}
