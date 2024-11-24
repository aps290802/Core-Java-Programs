package Inheritance;
import java.util.Scanner;
class G
{
	int cp;
	Scanner obj = new Scanner(System.in);
	void product_cp()
	{
		System.out.println("Enter ur product cp");
		cp = obj.nextInt();
	}
}
class F extends G
{
	int sp;
	void product_sp()
	{
		System.out.println("Enter us product sp");
		sp = obj.nextInt();
	}
}
class S extends F
{
	int diff;
	void PL_ac()
	{
		diff=sp-cp;
		System.out.println("Product cp = "+cp);
		System.out.println("Product sp = "+sp);
		System.out.println("Difference = "+diff);
		String ans = (sp>cp)? "profit" : "loss";
		System.out.println(ans);
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.product_cp();
		s1.product_sp();
		s1.PL_ac();
	}
}
