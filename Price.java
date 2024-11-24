import java.util.Scanner;
class Price 
{
    public static void main(String[] args) {
        double price, diff=0;
        int op=0;
        System.out.println("Plz enter product price");
        Scanner sc = new Scanner(System.in);
        price = sc.nextDouble();
        op = (int)price;
        diff = price-op;
        int ans = (diff>=.50) ? (++op) : (op);
        System.out.println("product price : "+ans);
    }
}
