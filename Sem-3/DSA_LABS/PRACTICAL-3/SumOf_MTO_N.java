import java.util.Scanner;

public class SumOf_MTO_N{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int sum=0;
        int n=0,m=0;
        
        System.out.print("Enter starting index:");
        m=inp.nextInt();
        System.out.print("Enter Ending  index:");
        n=inp.nextInt();
        
        for(int i=m;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print("Sum is "+sum);
        inp.close();
    }
}