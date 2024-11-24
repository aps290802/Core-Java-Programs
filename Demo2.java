//  print "2/1+4/3+6/5+8/7+10/9+ "
public class Demo2 {
    public static void main(String[] args) {
        int i,x=2;
        for(i=1;i<=10;i++)
        {
            if (i%2!=0) {
                System.out.print(x+"/"+i+"+" +"1");
                x=x+2;
            }

        }
    }
}
