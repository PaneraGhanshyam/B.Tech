import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Enter number:");
        int n=inp.nextInt();

        if (n%2==0) {
            System.out.print("Number is even.");
        } else {
            System.out.print("Number is odd.");
        }
        inp.close();
    }
}
