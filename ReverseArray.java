public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("original array: ");

        for (int num: numbers) {

            System.out.println(num + " ");
        }

        int left = 0;
        int right = numbers.length -1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
            System.out.println("\nReversed Array: " );
            for (int num:numbers) {
                System.out.println(num+ " ");

            }



    }
}
