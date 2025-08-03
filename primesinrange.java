public class primesinrange {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print all prime numbers in range 2 to n
    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); 
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinrange(20);
    }
}
