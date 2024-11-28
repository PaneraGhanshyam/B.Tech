public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {64, 97, 201, 34, 65, 89, 45, 34, 25, 12, 22, 99, 5};
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < n; j++) {
                int temp = arr[j];
                int i = j;

                while (i >= gap && arr[i - gap] > temp) {
                    arr[i] = arr[i - gap];
                    i -= gap;
                }
                arr[i] = temp; 
            }
        }

        System.out.println("Array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
