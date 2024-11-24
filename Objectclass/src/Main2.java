class B
{
    int rno;
    String name;
    B(int rn, String nname)
    {
        rno=rn;
        name=nname;
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        A a1 = new A(101, "Jay");
        A a2 = new A(102, "Jayesh");
        A a3 = new A(101, "Jay");
        System.out.println(a1.equals(a3));
    }
}
