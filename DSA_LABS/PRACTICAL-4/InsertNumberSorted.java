import java.util.Scanner;

public class InsertNumberSorted {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = inp.nextInt();

        int[] arr = new int[size + 1]; // Increased size to accommodate new element

        System.out.print("Enter elements in sorted form: ");
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.print("Enter number to insert: ");
        int n = inp.nextInt();

        int i = size - 1;

        while (i >= 0 && arr[i] > n) {
            arr[i + 1] = arr[i]; 
            i--;
        }

        arr[i + 1] = n;

        System.out.print("Updated array: ");
        for (int j = 0; j <= size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        inp.close();
    }    
}
