public class Program66
{
    public static void main(String []args)
    {
        int a[]={23,56,2,3,7},i,j,temp=0;
        System.out.println("array ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+"\t");
        }
        for(i=0; i<5; i++)
        {
            for(j=0; j<4; j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("array decending order");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
