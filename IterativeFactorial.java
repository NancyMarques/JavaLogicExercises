public class IterativeFactorial {

    public static void main(String[] args) {
        int number = 5;

        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    private static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");

    }
        long factorial = 1;

        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
