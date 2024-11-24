package Constructor;

class AAA
{
	AAA()
	{
		System.out.println("Constructor overloading");
	}
	AAA(int x)
	{
		System.out.println(x);
	}
	AAA(double pi, int r)
	{
		System.out.println("Area : " +(pi*r*r) );
	}
	AAA(String name)
	{
		System.out.println("My name is "+name);
	}
}

public class Demo4 {

	public static void main(String[] args) 
	{
		AAA a1 = new AAA();
		AAA a2 = new AAA(3);
		AAA a3 = new AAA(3.14, 5);
		AAA a4 = new AAA("Anuj Thakur");
	}

}
