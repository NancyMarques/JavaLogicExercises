public class CountCharacters {

    public static void main(String[] args) {
        String str = "Hello World";
        char targetChar = 'l';
        str = str.toLowerCase();

        int count = countChar(str, targetChar);
        System.out.println("The number of " + targetChar + " in " + str + " is " + count);
    }

    private static int countChar(String str, char targetChar) {

        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(targetChar == str.charAt(i)){
                count++;
            }

        }
        return count;
    }
}
