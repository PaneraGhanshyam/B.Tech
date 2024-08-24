import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = inp.nextInt();

        int[] arr = new int[size + 1]; 
        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.print("Enter number to insert: ");
        int n = inp.nextInt();

        System.out.print("Enter position between 0 and " + size + ": ");
        int p = inp.nextInt();

        if (p < 0 || p > size) {
            System.out.println("Invalid position.");
            inp.close();
            return;
        }

        for (int i = size; i >= p; i--) {
            arr[i] = arr[i - 1];
        }

        arr[p] = n;
        
        System.out.print("Updated array: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        inp.close();
    }    
}
