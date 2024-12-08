import java.util.Scanner;

public class PracticalA_57{
    public static void main(String args[]){

        Scanner inp=new Scanner(System.in);
        Node First=null;
        int ch=1;
        int data=0;
        int pos=0;


        while(ch!=0){
            System.out.println("\nEnter 1 to insert at beginning.");
            System.out.println("Enter 2 to insert at last.");
            System.out.println("Enter 3 to delete at first.");
            System.out.println("Enter 4 to delete at last.");
            System.out.println("Enter 5 to delete at position.");
            System.out.println("Enter 6 to print list.");
            System.out.println("Enter 0 to exit.");
            System.out.print("Enter Choice: ");
            ch=inp.nextInt();

            switch(ch){
                case 1:            
                        System.out.print("Enter element:");
                        data=inp.nextInt();
                        First=insertBeginning(First,data);
                        break;
                case 2:
                        System.out.print("Enter element:");
                        data=inp.nextInt();
                        First=insertEnd(First,data);
                        break;
                case 3:
                        First=deleteFirst(First);
                        break;
                case 4:
                        First=deleteLast(First);
                        break;
                case 5:
                        System.out.print("Enter position:");
                        pos=inp.nextInt();
                        First=deleteAtPosition(First,pos);
                        break;
                case 6: 
                        printList(First);
                        break;
                case 0:
                        System.out.print("Exited successfully.");
                        break;
                default:
                        System.out.print("Enter valid choice!!!!!");

            }


        }
        inp.close();               
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
    static Node deleteFirst(Node First){
        
        if(First==null){
            System.out.println("Linked list is empty.");
            return First;
        }
        else{
            First=First.link;
            return First;
        }
    }
    static Node deleteLast(Node First){

        if(First==null){
            System.out.println("List is empty.");
            return First;
        }else if(First.link==null){
            First=null;
            return First;
        }else{
            Node temp=First;
            while(temp.link.link!=null){
                temp=temp.link;
            }
            temp.link=null;
            return First;
        }
    }
    static Node deleteAtPosition(Node First,int pos){

        if(First==null){
            System.out.println("List is empty.");
            return First;
        }
        else{
            if(pos==First.info){
                First=First.link;
                return First;
            }
            else{
                Node temp=First,pred=null;
    
                while(temp.link!=null && temp.info!=pos){
                    pred=temp;
                    temp=temp.link;
                    
                }
                if(temp.info==pos){
                    pred.link=temp.link;
                    return First;
                }
                else{
                    System.out.println("Node not found!!!!");
                    return First;
                }
                
            }
        }
       
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