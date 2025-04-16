public class Question29 {

    public static boolean isPalindrome(int x) {
        // Handle edge cases
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            // Get the last digit of x and add it to reversedHalf
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10; // Remove the last digit from x
        }

        // Check if the number is a palindrome
        return x == reversedHalf || x == reversedHalf / 10;
    }
}