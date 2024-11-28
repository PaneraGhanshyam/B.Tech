import java.util.Scanner;
public class PracticalA_56{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Node First=null;
        System.out.print("Enter value to insert: ");
        int x=inp.nextInt();
        Node newNode=new Node(x);
        First=newNode;
        System.out.println(First.info);
        inp.close();
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
