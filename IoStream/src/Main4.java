import java.io.*;
public class Main4
{
    public static void main(String[] args)
    {
        File f = new File("Demo.txt");
        System.out.println("name =  "+f.getName());
        System.out.println("path ="+f.getAbsolutePath());
        System.out.println("write = "+f.canWrite());
        System.out.println("read = "+f.canRead());
        System.out.println("Delete = "+f.delete());

    }
}
