package Variable;
class A
{
	int a = 10; //Non-static variable
	static int b = 20; //Static Variable
	final int d = 100; // Constant, value will be fixed.
	void Show()
	{
		System.out.println("Non- Static Method");
	}
	static void demo()
	{
		System.out.println("Static Method");
	}
	void dash()
	{
		int c = 30; // Local Variable.
		System.out.println(c);
	}
	

}
public class Var 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.a);
		a1.Show();
		System.out.println(A.b);
		A.demo();
		a1.dash();
		System.out.println(a1.d);
	}
}
