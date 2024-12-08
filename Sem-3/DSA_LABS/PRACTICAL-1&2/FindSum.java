import java.util.Scanner;
public class FindSum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=inp.nextInt();

        int sum=1;

        for(int i=2;i<=n+1;i++) {
            System.out.println(sum);
            sum=sum+i;
        }

        inp.close();
    }
}
