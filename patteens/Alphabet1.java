/*
A
A B
A B C 
A B C D 
A B C D E
 */
public class Alphabet1 {
    public static void main(String[] args) {
        int i,j;
        int a = 64;
        for (i = 1; i <= 5; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print((char) (a+j) +" ");
            }
            System.out.println();
        }
    }
}
