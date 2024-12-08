import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x,p;

        System.out.print("Enter number:");
        x=inp.nextInt();
        System.out.print("Enter power:");
        p=inp.nextInt();

        int res=1;
        for(int i=1;i<=p;i++){
            res*=x;
        }

        System.out.print("Power is:"+res);

        inp.close();
    }
}
