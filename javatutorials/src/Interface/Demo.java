package Interface;

interface Test
{
	int a=100;
	void show();
}

public class Demo implements Test
{
	public void show()
	{
		System.out.println("Interface method override");
	}
	public static void main(String[] args) 
	{
		Test t1 = new Demo();
		t1.show();
		System.out.println(a);
		System.out.println("Demo Interface pro.");	
	}
}
