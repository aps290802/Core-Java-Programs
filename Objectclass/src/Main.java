class A
{
    int rno;
    String name;
    A(int rn, String nname)
    {
        rno=rn;
        name=nname;
    }
    @Override
    public String toString()
    {
        return name;
    }

    public int hashcode()
    {
        return rno;
    }
}
public class Main {
    public static void main(String[] args)
    {
        A a1 = new A(101,"Shiva");
        System.out.println(a1.toString());
        System.out.println(a1.hashcode());
    }
}