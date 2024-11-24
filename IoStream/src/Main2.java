import java.io.*;
public class Main2
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw = new FileWriter("Demo.txt");
        fw.write("Hello, How are you. I am fine.");
        fw.close();
    }
}
