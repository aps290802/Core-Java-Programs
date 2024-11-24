import java.io.*;
public class Program5 
{
    public static void main(String[] args) throws IOException
    {
        double C,F;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter farhenheit degree to convert ");
        String input = obj.readLine();

        F = Double.parseDouble(input);
        C= (5*(F-32)/9);

        System.out.format("Converted Temperature form farhenheit to celsius = " +C);
    }
}
