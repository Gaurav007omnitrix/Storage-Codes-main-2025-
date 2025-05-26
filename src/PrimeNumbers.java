public class PrimeNumbers {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            if (n > 1 && isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
