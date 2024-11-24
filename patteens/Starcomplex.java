public class Starcomplex {
    public static void main(String[] args)
    {
        int i;
        int j;
        int n = 16;

        for(i =0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                if(i == 0 || i == n-1 || j == 0
                        || j == n-1 ||
                        i == n/2 || j == n/2 || i == j || (i+j) == n-1
                        || (i+j) == n/2 || (i-j) == n/2 ||
                        (i+j) ==(n-1) + n/2 || (j-i) == n/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
