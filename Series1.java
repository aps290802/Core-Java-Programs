// print (2+12+36+80+130)
public class Series1 {
    public static void main(String[] args) {
        int i,sum=0,j=1;
        
        for(i=1;i<=4;i++)
        {
            j=((i*i*i)+(i*i));
            System.out.print(j+("+"));
            sum = sum+j;
        }
       System.out.print(+sum);
    }
}
