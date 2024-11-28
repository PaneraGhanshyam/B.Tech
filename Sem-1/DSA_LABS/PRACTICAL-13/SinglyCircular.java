import java.util.Scanner;

public class SinglyCircular {
    static Node First = null;
    static Node Last = null;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at Last");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    value = inp.nextInt();
                    insertBegSinglyCircular(value);
                    break;

                case 2:
                    System.out.print("Enter value to insert at last: ");
                    value = inp.nextInt();
                    insertLastSinglyCircular(value);
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = inp.nextInt();
                    deleteSinglyCircular(value);
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        inp.close();
    }

    static void insertBegSinglyCircular(int x) {
        Node newNode = new Node(x);

        if (First == null) {
            newNode.link = newNode;
            First = newNode;
            Last = newNode;
        } else {
            newNode.link = First;
            First = newNode;
            Last.link = newNode;
        }
    }

    static void insertLastSinglyCircular(int x) {
        Node newNode = new Node(x);

        if (First == null) {
            newNode.link = newNode;
            First = newNode;
            Last = newNode;
        } else {
            Last.link = newNode;
            Last = newNode;
            newNode.link = First;
        }
    }

    static void display() {
        if (First == null) {
            System.out.println("List is empty.");
        } else {
            Node Temp = First;
            System.out.print("List is: ");
            do {
                System.out.print(Temp.info + " ");
                Temp = Temp.link;
            } while (Temp != First);
            System.out.println();
        }
    }

    static void deleteSinglyCircular(int x) {
        if (First == null) {
            System.out.println("List is empty.");
        } else {
            Node Temp = First;
            Node Pred = null;

            if (Temp==Last && Temp.info==x) {
                First=null;
                Last=null;
            } else if(Temp.info == x){
                First = First.link;
                Last.link = First;
            }else {
                while (Temp.info != x && Temp != Last) {
                    Pred = Temp;
                    Temp = Temp.link;
                }

                if (Temp.info == x && Temp == Last) {
                    Last = Pred;
                    Last.link = First;
                } else if (Temp.info == x) {
                    Pred.link = Temp.link;
                } else {
                    System.out.println("Element not found.");
                }
            }
        }
    }
}

class Node {
    int info;
    Node link;

    Node(int x) {
        this.info = x;
        this.link = null;
    }
}
