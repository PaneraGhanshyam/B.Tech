import java.util.Scanner;

public class UserInputSum{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter num1:");
        int num1 =inp.nextInt();
        System.out.print("Enter num2:");
        int num2 =inp.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is "+sum);
        
        inp.close();
    }
}