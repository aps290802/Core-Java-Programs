class PrimeNumberRecursion {

    // Recursive method to check if a number is prime
    int isPrime(int num, int divisor) {
        // Base case: If number is less than 2, it's not prime
        if (num < 2) {
            return 0;  // Not prime
        }
        // Base case: If divisor becomes 1, the number is prime
        if (divisor == 1) {
            return 1;  // Prime
        }
        // If num is divisible by any divisor, it's not prime
        if (num % divisor == 0) {
            return 0;  // Not prime
        }
        // Recursive case: Check for the next divisor (divisor - 1)
        return isPrime(num, divisor - 1);
    }

    // Recursive method to print prime numbers from start to end
    int printPrimes(int currentNum, int end) {
        // Base case: Stop recursion when currentNum exceeds end (100)
        if (currentNum > end) {
            return 1;  // Success code
        }
        // If the current number is prime, print it
        if (isPrime(currentNum, currentNum / 2) == 1) {
            System.out.println(currentNum);
        }
        // Recursive case: Check the next number
        return printPrimes(currentNum + 1, end);
    }
}

public class PrimeRecursion {
    public static void main(String[] args) {
        PrimeNumberRecursion primeRecursion = new PrimeNumberRecursion();
        // Start printing primes from 1 to 100
        primeRecursion.printPrimes(1, 100);
    }
}

