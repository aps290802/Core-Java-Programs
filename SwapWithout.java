import java.io.*;
public class SwapWithout {
    public static void main(String[] args) throws IOException
    {
        int a,b;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number :");
        a = Integer.parseInt(sc.readLine());
        System.out.println("Enter second number : ");
        b = Integer.parseInt(sc.readLine());
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped : "+a);
        System.out.println(+b);
    }
}
