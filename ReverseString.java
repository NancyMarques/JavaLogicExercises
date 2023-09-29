public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedString = reverseString2(str);

        System.out.println(str);
        System.out.println(reversedString);
    }

    private static String reverseString2(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length -1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }

    public static String reverseString(String str) {
        // Base case
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: reverse the substring excluding the first character,
        // and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
