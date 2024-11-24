package Constructor;

class A
{
	void show()
	{
		System.out.println("My method");
	}
	A()
	{
		System.out.println("My constructor");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 =new A();
		a1.show();
	}

}
