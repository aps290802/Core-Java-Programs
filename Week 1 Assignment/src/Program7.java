import java.io.*;
public class Program7 {
    /*Program to swap 2 numbers using third variable.(Take input from keyborad via BufferedReader class object) */
    public static void main(String[] args) throws IOException 
    {
        int a, b, c=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number :");
        a = Integer.parseInt(obj.readLine());
        System.out.println("Enter second number :");
        b = Integer.parseInt(obj.readLine());
        System.out.println("Before Swapping");
        System.out.println("a ="+a+" b="+b);
        a=c;
        a=b;
        c=a;
        System.out.println("After Swapping");
        System.out.println("a ="+a+" b="+b);
    }
}
