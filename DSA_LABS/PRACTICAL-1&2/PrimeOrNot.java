import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=inp.nextInt();

        int count=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.print("Number is prime.");
        } else {
            System.out.print("Number is not prime.");
        }
        inp.close();
    }
}
