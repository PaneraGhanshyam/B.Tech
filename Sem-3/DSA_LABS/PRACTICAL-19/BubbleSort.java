public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 5556, 25, 12, 12, 34, 221, 11, 6669, 90, 5};
        int last = arr.length - 1;

        for (int i = 0; i < last; i++) {
            int exchs = 0; 
            for (int j = 0; j < last - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    exchs++; 
                }
            }
            if (exchs == 0) {
                break;
            }
        }

        System.out.println("Array is:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
