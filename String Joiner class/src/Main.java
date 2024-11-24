import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        StringJoiner s1 = new StringJoiner(",");
        s1.add("Any");
        s1.add("Anyone");
        s1.add("Anywhere");
        System.out.println(s1);
        StringJoiner s2 = new StringJoiner("-","[","]");
        s2.add("Some");
        s2.add("Someone");
        s2.add("Somewhere");
        System.out.println(s2);
        StringJoiner s3 = s1.merge(s2);
        System.out.println(s3);
    }
}