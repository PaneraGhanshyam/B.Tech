import java.util.Arrays;

public class DeleteNumberAsc {
    public static int[] deleteNumber(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }
            return newArr;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        int numberToDelete = 3;
        int[] updatedArray = deleteNumber(sortedArray, numberToDelete);
        System.out.println(Arrays.toString(updatedArray));
    }
}
