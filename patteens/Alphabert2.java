public class Alphabert2 {
    public static void main(String[] args) 
    {
        int i,j;
        int a =64;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5+1-i;j++)
            {
                System.out.print((char) (a+j) +" ");
            }
            System.out.println();
        }
    }
}
