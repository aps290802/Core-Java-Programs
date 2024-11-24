public class Alphabet3 {
    public static void main(String[] args) 
{
    // int i,j;
    // int a =64;
    // for(i=1;i<=5;i++)
    // {
    //     for(j=i;j<=5;j++)
    //     {
    //         System.out.print((char) (a+j) +" ");
    //     }
    //     System.out.println();
    // }
    for (int k = 1; k <= 5; k++) {
        for (int l = 6-k ; l <= 5; l++) {
            System.out.print(l);
        }
        System.out.println();
    }
}
}