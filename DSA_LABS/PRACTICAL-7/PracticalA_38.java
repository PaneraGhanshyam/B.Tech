import java.util.Scanner;
public class PracticalA_38 {
    static Scanner inp=new Scanner(System.in);
    public static void main(String[] args) {
        int n,TOP=-1;
        System.out.print("Enter size of array:");
        n=inp.nextInt();
        int stack[]=new int[n];
        TOP=push(stack,n,TOP); 
        TOP=push(stack,n,TOP);        
        TOP=push(stack,n,TOP);        
        TOP=push(stack,n,TOP);      
        display(stack, TOP); 
        TOP=pop(stack, TOP);
        TOP=pop(stack, TOP);
        display(stack, TOP);
        TOP=push(stack,n,TOP);        
        TOP=push(stack,n,TOP);
        display(stack, TOP);
        inp.close();
    }
    static int push(int s[],int n,int TOP){
        if(TOP>=n-1){
            System.out.println("Stack is overflow!!!!!");
            return TOP;
        }
        else{
            System.out.print("Enter value : ");
            int x=inp.nextInt();
            TOP=TOP+1;
            s[TOP]=x;
        }
        return TOP;
    }
    static int pop(int s[],int TOP){
        if (TOP==-1) {
            System.out.print("Stack is empty.");
            return TOP;
        } else {
            System.out.print("\nDeleted element is : "+s[TOP]);
            TOP=TOP-1;
        }
        return TOP;
    }
    static void display(int s[],int TOP){
        if (TOP==-1) {
            System.out.print("Stack is empty.");
        } else {
            int temp=TOP;
            System.out.print("\nStack is : ");
            while(temp>=0){
                System.out.print(s[temp]+" ");
                temp--;
            }   
        }
    }
   

}
