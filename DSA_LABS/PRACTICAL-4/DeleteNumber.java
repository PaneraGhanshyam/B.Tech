import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = inp.nextInt();

        int[] arr = new int[size]; 
        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.print("Enter position between 0 and " + (size-1) + ": ");
        int p = inp.nextInt();

        if (p < 0 || p > size-1) {
            System.out.println("Invalid position.");
            inp.close();
            return;
        }

        for (int i = p; i < size-1; i++) {
                arr[i] = arr[i + 1];
        }
        
        System.out.print("Updated array: ");
        for (int i = 0; i < size-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        inp.close();
    }    
}
