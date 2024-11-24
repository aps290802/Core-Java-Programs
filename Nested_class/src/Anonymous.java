//class C
//{
//    public void show()
//    {
//        System.out.println("Base Class");
//    }
//}
//class D extends C
//{
//    C obj = new C();
//    {
//        void show()
//        {
//            System.out.println("Anonymous");
//        }
//    };
//    void demo()
//    {
//        System.out.println("Outer Class");
//    }
//}
//public class Anonymous
//{
//    public static void main(String[] args)
//    {
//        D d1 = new D();
//        d1.demo();
//        d1.show();
//        d1.obj.show();
//    }
//}
class C {
    public void show() {
        System.out.println("Base Class");
    }
}

class D extends C {
    // Anonymous inner class that overrides the show method of class C
    C obj = new C() {
        @Override
        public void show() {
            System.out.println("Anonymous");
        }
    };

    void demo() {
        System.out.println("Outer Class");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        D d1 = new D();
        d1.demo();       // Calls demo() of class D
        d1.show();       // Calls show() of class C (inherited by D)
        d1.obj.show();   // Calls show() of the anonymous class
    }
}
