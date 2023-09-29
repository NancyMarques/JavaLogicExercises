public class Palindrome {
    public static void main(String[] args) {
        String word = "noon";
        
        if(checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        }
        else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    private static boolean checkPalindrome(String word) {
        if (word == null) {
            return false;
        }

        word = word.toLowerCase();

        int left = 0;
        int right = word.length()-1;

        while(left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
