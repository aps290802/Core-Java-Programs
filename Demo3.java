//  print "5/1+4/2+3/3+2/4+1/5+ "
public class Demo3 {
    public static void main(String[] args) {
        int i,x=5;
        for(i=1;i<=5;i++)
        {
           System.out.print(x+"/"+i+"+");
           x--;
        }
    }
}
