import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int a,b;

        System.out.print("Enter number A:");
        a=inp.nextInt();

        System.out.print("Enter number B:");
        b=inp.nextInt();

        // int c=a;
        // a=b;
        // b=c;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.print("After swap value of A : "+a+" and B : "+b);

        inp.close();
    }
}
