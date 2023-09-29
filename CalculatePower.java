public class CalculatePower {
    public static void main(String[] args) {
        double base = 3;
        int exponent = 0;
        double result = calculatePower(base, exponent);
        System.out.println("The result is: " + result);
    }

    private static double calculatePower(double base, int exponent) {
        if(exponent == 0){
            return 1.0;
        }
        double result = 1.0;
        boolean negativeExponent = false;

        if(exponent < 0) {
            negativeExponent = true;
            exponent = -exponent;
        }

        for (int i = 0; i < exponent ; i++) {
            result *= base;
        }
        return negativeExponent ? 1.0 / result : result;
    }
}
