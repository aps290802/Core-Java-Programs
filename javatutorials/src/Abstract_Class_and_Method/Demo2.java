package Abstract_Class_and_Method;

abstract class C
{
	int i,j,k;
	void fact(int x)
	{
		int ans=1;
		for(i=x;i>=1;i--)
		{
			ans=ans*i;
		}
		System.out.println("Factorial :- " +ans);
	}
	void sum(int y)
	{
		int ans2=0;
		for(i=1;i<=y;i++)
		{
			ans2=ans2+i;
		}
		System.out.println("Sum of postive numbers = " +ans2);
	}
	void show()
	{
		System.out.println("Hello");
	}
}

class D extends C
{
	void sum(int x,int y)
	{
		System.out.println("Sum of two numbers = "+(x+y));
	}
}


public class Demo2 {

	public static void main(String[] args) 
	{
		int m=5,n=10;
		D d1 =new D();
		d1.fact(m);
		d1.sum(n);
		d1.show();
		d1.sum(m, n);
	}

}
