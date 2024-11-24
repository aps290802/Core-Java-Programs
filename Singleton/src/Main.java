class Student
{
    static Student s1 = new Student();
    private Student()
    {
        System.out.println("Hello");
    }
    static Student show()
    {
        return s1;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Student obj = Student.show();
    }
}