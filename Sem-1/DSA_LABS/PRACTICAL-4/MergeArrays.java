import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 1, 4};
        int[] array2 = {6, 5, 2};
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
