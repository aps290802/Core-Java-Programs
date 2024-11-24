package Interface;

interface First
{
	void table(int y);
}

interface Second extends First
{
	void fact(int x);
}

public class Demo2 implements Second
{
	int i,ans=1;
	public void fact(int x)
	{
		for(i=x;i>=1;i--)
		{
			ans=ans*i;
		}
		System.out.println("Factorial = "+ans);
	}
	public void table(int y)
	{
		System.out.println("To print table of "+y);
		for(i=1;i<=10;i++)
		{
			System.out.println(y*i);
		}
	}
	public static void main(String[] args) 
	{
		Second s1 = new Demo2();
		s1.fact(5);
		s1.table(8);

	}

}
