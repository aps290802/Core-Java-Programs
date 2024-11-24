public class Program9 
{
    public static void main(String[] args) 
    {
        int a,b;
        double per;
        a= Integer.parseInt(args[0]);
        b= Integer.parseInt(args[1]);
        System.out.println("The number which i wil give in command line as a argumant");
        if (a%2==0 ) 
        {   a+=2;
            System.out.println(a);
        }
        else
        {   a++;
            System.out.println(a);
        }
        if (b%2==0 ) 
        {
            b+=2;
            System.out.println(b);
        }
        else
        {
            b++;
            System.out.println(b);
        }       
    }  
}
