package Test;
public class First {
    int fact = 1;

    public int Factorial(int x) {
        for (int i = x; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
        return fact;
    }
    public void Table(int y)
    {
        System.out.println("Enter a number which you want to print a table :  ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Table = " + (y * i));
        }
    }

    public void starTriangle(int z)
    {
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
