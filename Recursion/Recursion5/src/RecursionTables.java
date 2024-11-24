class MultiplicationTables
{
        // Recursive method to print the multiplication table for a specific number, returns an int when completed
        int printTable(int num, int multiplier) {
            if (multiplier > 10) {
                return 1;  // Base case: return 1 when the table is fully printed
            }
            // Print the current multiplication result
            System.out.println(num + " * " + multiplier + " = " + (num * multiplier));

            // Recursive call to print the next multiplication for the current table
            return printTable(num, multiplier + 1);  // Propagate the return value
        }
//
        // Recursive method to print tables from 1 to 5, returns an int when all tables are printed
//        int printTables(int num) {
//            if (num > 5) {
//                return 1;  // Base case: return 1 when all tables are printed
//            }
//
//            // Call the printTable method to print the table of the current number
//            printTable(num, 1);
//
//            // Add a line break between tables for readability
//            System.out.println();
//
//            // Recursive call to print the next table (num + 1)
//            return printTables(num + 1);  // Propagate the return value
//        }
    }
    public class RecursionTables
    {

        public static void main(String[] args) {
            MultiplicationTables tables = new MultiplicationTables();
            int result = tables.printTable(5,1);  // Start printing tables from 1
            System.out.println("Tables printing finished with return value: " + result);  // Print the final result
        }
    }


