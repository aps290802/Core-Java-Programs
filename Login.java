import java.util.Scanner;
class Login
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

        System.out.println("Enter username");
        username = sc.nextLine();

        System.out.println("Enter password");
        password = sc.nextLine();
         
       if (username.equals("Hello") && password.equals("12345"))
        {
         System.out.println("Login Success");
       }
       else
       {
        System.out.println("Username and Password invalid");
       }
    }
}