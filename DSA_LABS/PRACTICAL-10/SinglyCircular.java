import java.util.Scanner;
public class SinglyCircular {
    static Node First=null,Last=null;
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        SinglyCircularInsBeg(10);
        SinglyCircularInsBeg(20);
        SinglyCircularInsBeg(30);
        SinglyCircularInsBeg(40);
        SinglyCircularInsBeg(50);   
        displayList();     
        inp.close();
    }
    static void SinglyCircularInsBeg(int x){
        Node newNode=new Node(x);

        if(First==null){
            newNode.link=newNode;
            First=newNode;
            Last=newNode;
        }else{
            newNode.link=First;
            First=newNode;
            Last.link=First;
        }
    }
    static void displayList(){
        if(First == null){
            System.out.println("List is empty.");
        }
        else{
            System.out.print("List is : ");
            Node temp=First;
            while(temp!=Last){
                System.out.print(temp.info+" ");
                temp=temp.link;
            }
            // do {
            //     System.out.print(temp.info+" ");
            //     temp=temp.link;
            // } while (temp != First);
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
