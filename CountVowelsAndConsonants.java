import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for(int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);

            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelsCount++;
                }else{
                    consonantsCount++;
                }
            }
        }

        System.out.println("vowels: " + vowelsCount);
        System.out.println("consonants" + consonantsCount);

        scanner.close();
    }
}
