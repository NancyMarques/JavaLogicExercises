public class FibonacciIteration {
    public static void main(String[] args) {

        int number = 10;
        printFibonacciSeries(number);
    }

    private static void printFibonacciSeries(int number) {

        if (number <=0){
            System.out.println("Invalid input");
            return;
        }

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.println("Fibonacci Series (First " + number + " terms): ");
        for (int i = 1; i < number; i++) {
            System.out.println(firstTerm + " ");

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
