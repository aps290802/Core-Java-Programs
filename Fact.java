// Program to check the factorial of any number.
import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        int i,n,fact=1;
        System.out.println("Plz enter the number to calculate factorial : ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        for (i = 1; i <=n; i++) {
            fact=fact*i;
        }
        System.out.println(fact);        
    }
}
