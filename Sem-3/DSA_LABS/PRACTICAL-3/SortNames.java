import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int n = inp.nextInt();
        inp.nextLine();

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = inp.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        inp.close();
    }
}
