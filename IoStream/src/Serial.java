import java.io.*;
class A implements Serializable
{
    int rno;
    String name;
    double per;
}
public class Serial
{
    public static void main(String[] args) throws Exception
    {
        A a1 = new A();
        a1.rno =  123;
        a1.name = "Anuj";
        a1.per = 33.33;
        FileOutputStream fo = new FileOutputStream("Test.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(a1);
    }
}
