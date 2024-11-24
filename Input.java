import java.io.*;
public class Input {
    public static void main(String[] args) throws IOException 
    {
        int a, b, c;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number :");
        a = Integer.parseInt(obj.readLine());
        System.out.println("Enter second number :");
        b = Integer.parseInt(obj.readLine());
        c=a+b;
        System.out.println("Addition : "+c);
    }
}
