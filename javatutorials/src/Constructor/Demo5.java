package Constructor;

class B
{
	int a,b;
	B(int x, int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("a = "+a+" b = "+b);
	}
	B(B ref)
	{
		a = ref.a;
		b = ref.b;
	}
}
public class Demo5 
{
	public static void main(String[] args) 
	{
		B b1 = new B(10,20);
		B b2 = new B(b1);
		b1.show();
		b2.show();
	}

}
