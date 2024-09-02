import java.util.Scanner;
public class PracticalA_59 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Node First=null,First2=null;
        int ch=1,data;

        while(ch!=0){
            System.out.println("\nEnter 1 to insert in list 1.");
            System.out.println("Enter 2 to insert in list 2.");
            System.out.println("Enter 3 to to compare.");
            System.out.println("Enter 4 to print both list.");
            System.out.println("Enter 0 to exit.");
            System.out.println("Enter choice: ");
            ch=inp.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element:");
                    data=inp.nextInt();
                    First=insertFirst(First,data);
                    break;
                case 2:
                    System.out.print("Enter element:");
                    data=inp.nextInt();
                    First2=insertFirst(First2,data);
                    break;
                case 3:
                    break;
                case 4:
                    printList(First,First2);
                    break;
                case 0:
                    System.out.println("Exited successfully.");
                default:
                    System.out.println("Enter valid choice.");
                    break;
            }



        }
        inp.close();   
    }
    static Node insertFirst(Node First,int x){
        Node newNode=new Node(x);

        if(First==null){
            First=newNode;
            return First;
        }else{
            newNode.link=First;
            First=newNode;
            return First;
        }
    }
    static void printList(Node First,Node First2){
        if(First==null){
            System.out.println("List 1 is empty.");
        }else{
            System.out.print("List 1 : ");
            Node temp=First;
            while(temp!=null){
                System.out.print(temp.info+" ");
                temp=temp.link;
            }
        }
        if(First2==null){
            System.out.println("List 2 is empty.");
        }else{
            System.out.print("\nList 2 : ");
            Node temp=First2;
            while (temp!=null) {
                System.out.print(temp.info+" ");
                temp=temp.link;
            }
        }
    }
}
class Node{
    int info;
    Node link;

    Node(int x){
        this.info=x;
        this.link=null;
    }
}
