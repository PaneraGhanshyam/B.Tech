public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {89, 64, 34, 25, 5, 12, 22, 65, 3};

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];  
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    
}
