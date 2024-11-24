// print ( 65/A+66/B+67/C+68/D+69/E+)
public class Demo7 {
    public static void main(String[] args) {
    int i;
    char str = 'A';
    int j = (int)str;
    for(i=1;i<=5;i++)
    {
       
        System.out.print(j+"/"+str+"+");
        str++;
        j++;
    }
    }
}
