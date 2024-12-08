import java.util.Scanner;

public class QueueOperation {
    static int queue[];
    static int front = -1, rear = -1;
    static int n;

    QueueOperation(int n) {
        queue = new int[n];
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter size of the queue: ");
        int size = inp.nextInt();

        QueueOperation q = new QueueOperation(size);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Insert at Front (for Deque)");
            System.out.println("4. Delete from Rear (for Deque)");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int x = inp.nextInt();
                    q.enQueue(x);
                    break;
                case 2:
                    q.deQueue();
                    break;
                case 3:
                    System.out.print("Enter element to insert at front: ");
                    int y = inp.nextInt();
                    q.dQueueInsertFront(y);
                    break;
                case 4:
                    q.dQueueDeleteRear();
                    break;
                case 5:
                    q.display();
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

    void enQueue(int x) {
        if (rear >= n - 1) {
            System.out.println("Queue is overflow.");
        } else {
            rear++;
            queue[rear] = x;
            if (front == -1) {
                front = 0;
            }
        }
    }

    void deQueue() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Deleted element is: " + queue[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    void dQueueInsertFront(int x) {
        if (front == 0) {
            System.out.println("Queue is overflow.");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else {
                front--;
            }
            queue[front] = x;
        }
    }

    void dQueueDeleteRear() {
        if (rear == -1) {
            System.out.println("Queue is underflow.");
        } else {
            System.out.println("Rear deleted element is: " + queue[rear]);
            if (front == rear) {
                rear = front = -1;
            } else {
                rear--;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue is: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }
}
