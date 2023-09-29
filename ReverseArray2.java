public class ReverseArray2 {
    public static void main(String[] args) {

        int[] array = {0,1,2,3,4};
        int[] reversed = new int[array.length];
        int index = 0;

        for (int i = array.length -1; i >=0;  i--) {
            reversed[index++] = array[i];
        }

        System.out.println("reversed array: ");
        for (int num:reversed) {
            System.out.println(num + " ");
        }
    }

}
