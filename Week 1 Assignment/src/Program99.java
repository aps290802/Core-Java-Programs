public class Program99 
{
    public static void main(String[] args) {
        // Check if the user provided exactly 2 command line arguments
        if (args.length != 2) {
            System.out.println("Please provide exactly 2 numbers as command line arguments.");
            return;
        }
        try {
            // Parse the command line arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            // Find and print the next two adjacent even numbers for the first number
            System.out.println("Next two even numbers after " + num1 + ":");
            printNextEvenNumbers(num1);
            // Find and print the next two adjacent even numbers for the second number
            System.out.println("Next two even numbers after " + num2 + ":");
            printNextEvenNumbers(num2);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
    // Method to print the next two even numbers after the given number
    private static void printNextEvenNumbers(int num) {
        // If the number is odd, the next even number is num + 1, otherwise num + 2
        int nextEven1 = (num % 2 == 0) ? num + 2 : num + 1;
        int nextEven2 = nextEven1 + 2;
        // Print the results
        System.out.println(nextEven1 + ", " + nextEven2);
    }
    
}
