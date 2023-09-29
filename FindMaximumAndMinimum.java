public class FindMaximumAndMinimum {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > max){
                max = num;
            }

            if(num < min) {
                min = num;
            }

        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
