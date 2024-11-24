import java.io.*;
public class DeSerial
{
    public static void main(String[] args)  throws Exception
    {
        FileInputStream fi = new FileInputStream("Test.txt");
        ObjectInputStream os = new ObjectInputStream(fi);
        A a1 = (A) os.readObject();
        System.out.println("Roll = "+a1.rno);
        System.out.println("Name = " +a1.name);
        System.out.println("Percentage = "+a1.per+"%");
    }
}
