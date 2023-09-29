public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int target = 10;

        int index = findIndex(arr, target);

        if(index != -1){
            System.out.println(target + " found at " + index);
        }else{
            System.out.println(target + " not found in the array");
        }

    }

    private static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
