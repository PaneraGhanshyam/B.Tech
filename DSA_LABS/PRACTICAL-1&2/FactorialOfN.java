import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=inp.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }

        inp.close();
    }    
}
