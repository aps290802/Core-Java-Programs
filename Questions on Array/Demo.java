class A
{
     int a[] = {12,20,30,40,50},i;
     void show()
     {
       for(i=0;i<5;i++)
       {
        System.out.print(a[i]+"\t");
       }
     }
}
public class Demo {
   public static void main(String[] args) {
    A a1 = new A();
    a1.show();
   }
}
