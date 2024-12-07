public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");
        
        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check divisors up to square root
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It's a prime number
    }
}