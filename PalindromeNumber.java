public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 12321;

        if(isPalindrome(number)){
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }
    }

    private static boolean isPalindrome(int number) {
        if (number < 0){
            return false;
        }
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber == originalNumber;
    }
}
