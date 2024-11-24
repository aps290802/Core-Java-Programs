import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("Demo.txt");
        if (f.createNewFile())
        {
            System.out.println("File created....");
        }
        else
        {
            System.out.println("Not created...");
        }
    }
}