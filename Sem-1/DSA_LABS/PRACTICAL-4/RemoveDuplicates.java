import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] newArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArr[index++] = num;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] updatedArray = removeDuplicates(arrayWithDuplicates);
        System.out.println(Arrays.toString(updatedArray));
    }
}
