public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 153;

        if(isArmstrongNumber(n)){
            System.out.println(n + " is Armstrong Number");
        }else {
            System.out.println(n + " is not Armstrong Number");
        }


    }

    private static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int numberDigits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum +=Math.pow(digit, numberDigits);
            n /= 10;
        }
        return originalNumber == sum;
    }

    private static int countDigits(int n) {

        int count = 0;
        while(n > 0) {
            count++;
            n /=10;
        }
        return count;
    }
}
