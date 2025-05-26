public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 126; // Example number to check
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10;                // Remove the last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
