public class Star7
 {
    public static void main(String[] args)
    {
        int i,j;
    for(i=1;i<3;i++)
    {
        for(j=1;j<3+1-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        for(int k=1;k<i;k++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    for(i=1;i<=3;i++)
    {
        for(j=1;j<i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=3+1-i;k++)
        {
            System.out.print("*");
        }
        for(int k=1;k<3+1-i;k++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
