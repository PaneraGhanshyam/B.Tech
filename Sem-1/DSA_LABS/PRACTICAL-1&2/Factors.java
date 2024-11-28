import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=inp.nextInt();

        System.out.print("Factors:");
        for(int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
        inp.close();
    }
}
