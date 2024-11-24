public class Reverse {
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50}, i, temp;
        for(i=0;i<5/2;i++)
        {
            temp = a[i];
            a[i] = a[4-i];
            a[4-i] = temp;
        }
        System.out.println("Show data : ");
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+ " \t" );
        }        
    }
}
