import java.io.*;
public class SwappedwithThird 
{
    public static void main(String[] args) throws IOException
    {
        int a,b,c=1;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        a = Integer.parseInt(obj.readLine());
        System.out.println("Enter Second Number");
        b = Integer.parseInt(obj.readLine());
        c=a;
        a=b;
        b=c;
        System.out.println("Swapped With using third variable : ");
        System.out.println(+a+ " " +b);
    }
}
