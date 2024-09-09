import java.util.Scanner;

public class PracticalA_38 {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int n, TOP = -1;
        System.out.print("Enter size of array: ");
        n = inp.nextInt();
        int[] stack = new int[n];

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peep");
            System.out.println("5. Change");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1: 
                    TOP = push(stack, n, TOP); 
                    break;
                case 2: 
                    TOP = pop(stack, TOP);
                    break;
                case 3: 
                    display(stack, TOP);
                    break;
                case 4:
                    System.out.print("Enter position from top to peep: ");
                    int i = inp.nextInt();
                    peep(stack, TOP, i);
                    break;
                case 5:
                    System.out.print("Enter position from top to change: ");
                    int pos = inp.nextInt();
                    System.out.print("Enter new value: ");
                    int value = inp.nextInt();
                    change(stack, TOP, pos, value);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        inp.close();
    }

    static int push(int s[], int n, int TOP) {
        if (TOP >= n - 1) {
            System.out.println("Stack is overflow!!!!!");
            return TOP;
        } else {
            System.out.print("Enter value: ");
            int x = inp.nextInt();
            TOP = TOP + 1;
            s[TOP] = x;
        }
        return TOP;
    }

    static int pop(int s[], int TOP) {
        if (TOP == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Deleted element is: " + s[TOP]);
            TOP = TOP - 1;
        }
        return TOP;
    }

    static void display(int s[], int TOP) {
        if (TOP == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack is: ");
            for (int i = TOP; i >= 0; i--) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }

    static void peep(int s[], int TOP, int i) {
        if (TOP - i + 1 < 0) {
            System.out.println(i + "th element is not in the stack.");
        } else {
            System.out.println(i + "th element is: " + s[TOP - i + 1]);
        }
    }

    static void change(int s[], int TOP, int i, int x) {
        if (TOP - i + 1 < 0) {
            System.out.println("Stack is underflow.");
        } else {
            s[TOP - i + 1] = x;
        }
    }
}
