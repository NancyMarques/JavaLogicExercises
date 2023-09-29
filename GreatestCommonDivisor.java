public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int num1 = 48;
        int num2 = 36;
        
        int gdc = findGCD(num1, num2);
        System.out.println("The GDC of " + num1 + " and " + num2 + " is: " + gdc);
    }

    private static int findGCD(int num1, int num2) {

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while(num2 !=0){
            int temp = num2;
            num2 = num1 % num2; // 0.33
            num1 = temp;
        }
        return num1;
    }
}
