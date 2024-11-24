import java.util.Scanner;
class Rev
{
    public static void main(String[] args) 
    {
        int n,r,s=0;
        System.out.println("Enter any no. :" );
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        while (n!=0)
        {
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
            System.out.println(s);

    }
}