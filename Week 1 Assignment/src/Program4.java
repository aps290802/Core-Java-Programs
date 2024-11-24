import java.util.Scanner;;
public class Program4 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate years, months, and remaining days
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        // Display the result
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        scanner.close();
    }
}
