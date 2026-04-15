public class PalindromeExample {
    public static void main(String[] args) {
        int originalNum = 121;
        int num = originalNum;
        int reversedNum = 0;

        // Step 1: Reverse the number using modulo and division
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Step 2: Compare reversed number with the original
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
