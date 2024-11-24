public class Main
{
    public static void main(String[] args)
    {
        String str1 = "Ajay";
        String str2 = "Information";
        String str3 = "  Sharma";
        String str4 = "Hello";
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.length());
        System.out.println(str2.substring(2,6));
        System.out.println(str1.concat(str3));
        System.out.println(str3.length());
        System.out.println(str3.trim());
        System.out.println(str3.charAt(3));
        System.out.println(str1.equals(str2));
        System.out.println(str4.replace('H', 'C'));
    }
}