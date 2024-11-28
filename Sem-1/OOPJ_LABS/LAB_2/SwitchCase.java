import java.util.Scanner;

public class SwitchCase{
     public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        char op;
        int n1,n2;

        System.out.print("Enter number 1 :");
        n1=inp.nextInt();

        System.out.print("Enter number 2 :");
        n2=inp.nextInt();

        System.out.print("Enter operator :");
        op=inp.next().charAt(0);

        switch(op){
            case '+':System.out.print("Sum is : "+(n1+n2)); 
                     break;
            case '-':System.out.print("Subtraction is : "+(n1-n2));
                     break;
            case '*':System.out.print("Multiplication is : "+(n1*n2));
                     break;
            case '/':System.out.print("Division is : "+(n1/n2));
                     break;
            case '%':System.out.print("Modulo is : "+(n1%n2));
                     break;
            default:System.out.print("Enter valid input!!!!");

        }

        
        inp.close();
     }
}