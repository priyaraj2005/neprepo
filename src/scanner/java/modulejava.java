import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1 and negative numbers are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true;
    }
}
