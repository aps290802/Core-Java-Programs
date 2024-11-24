import java.util.Scanner;
interface B
{
    void si(int p, int r, int t);
}
public class Main2
{
    public static void main(String[] args)
    {
        B b1 = (int pri, int rate, int time) ->
        {
          double ans;
          ans = (pri*rate*time)/100;
            System.out.println();
            System.out.print("SI = " +ans);
            System.out.print("\nTotal Amount = " + (ans+pri));
        };
        int pp, rr, tt;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter priciple amount : " );
        pp = input.nextInt();
        System.out.print("Enter rate : " );
        rr = input.nextInt();
        System.out.print("Enter time (in years) : ");
        tt = input.nextInt();
        b1.si(pp,rr,tt);
    }
}
