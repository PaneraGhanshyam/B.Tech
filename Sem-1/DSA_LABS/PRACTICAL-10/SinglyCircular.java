public class SinglyCircular {
    static Node First=null,Last=null;
    public static void main(String[] args) {
        SinglyCircularInsBeg(10);
        SinglyCircularInsBeg(20);
        SinglyCircularInsBeg(30);
        SinglyCircularInsBeg(40);
        SinglyCircularInsBeg(50);   
        displayList();    
        count(); 
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
            do {
                System.out.print(temp.info+" ");
                temp=temp.link;
            } while (temp != First);
        }
    }
    static void count(){
        if (First==null) {
            System.out.print("List is Empty.");
        } else {
            int count=0;
            Node temp=First;
            do {
                count++;
                temp=temp.link;
            } while (temp!=First);
            System.out.print("\nCount of node is: "+count);
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
