public class CalculateAverage {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,5};

        int sum = 0;

        for (int num :arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("The average is: " + average);

    }
}
