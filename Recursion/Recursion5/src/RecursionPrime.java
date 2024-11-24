class Demo
{
    char ch ='a';
    int show(int i)
    {
        if(i>26)
        {
            return 0;
        }
        else
        {
            System.out.println(ch);
            ch++;
            i++;
            return show(i);
        }
    }
}
public class RecursionPrime
{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.show(1);
    }
}
