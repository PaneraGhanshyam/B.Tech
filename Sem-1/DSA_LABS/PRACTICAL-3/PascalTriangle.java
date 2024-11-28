import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = inp.nextInt();

        printPascalTriangle(rows);
        
        inp.close();
    }

    static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
