//Create a class Person with properties (name and age) with following features :
//1) Default age of person should be 18
//2) A parameterised constructor to initialise Person object.
//3) Method to diplsay name and age of person.
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown"; // Set a default name
        this.age = 18;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Program99
{
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Person b1 = new Person();
        b1.display(); // This will show default name ("Unknown") and age (18)

        // Creating an object using the parameterized constructor
        Person b2 = new Person("Kanchan", 25);
        b2.display();
    }
}
