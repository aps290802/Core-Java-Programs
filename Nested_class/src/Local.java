class M
{
    int a=100;
    void show()
    {
        int b=200;
        System.out.println("Local class Task");
        System.out.println(b);
    }
    void demo()
    {
        System.out.println("Local Class Declaration ");
        class N
        {
            void display()
            {
                System.out.println("Local class");
            }
        }
        N n1 = new N();
        n1.display();
    }
}
public class Local
{
    public static void main(String[] args)
    {
        M m1 = new M();
        m1.show();
        m1.demo();
    }
}
