import java.util.Scanner;

public class A_57{
    public static void main(String args[]){

        Scanner inp=new Scanner(System.in);
        Node First=null;

        for(int i=0;i<5;i++){
            int data=0;
            System.out.print("Enter element:");
            data=inp.nextInt();
           // First=insertBeginning(First,data);
           // First=insertEnd(First,data);
        }
        printList(First);
    }
    static Node insertBeginning(Node First,int data){
        Node New=new Node(data);

        if(First==null){
            First=New;
            return First;
        }else{
            New.link=First;
            First=New;
            return First;
        }

    }
    static Node insertEnd(Node First,int data){
        Node New=new Node(data);

        if(First==null){
            First=New;
            return First;
        }else{
            Node Temp=First;

            while(Temp.link != null){
                Temp=Temp.link;
            }

            Temp.link=New;

            return First;
        }

    }
    //static Node insertAtPosition(){

    }
    static void printList(Node Temp){
        while(Temp != null){
            System.out.print(Temp.info+" ");
            Temp =Temp.link;
        }
    }
}
class Node{
    int info;
    Node link;

    Node(int data){
        this.info=data;
        this.link=null;
    }
}