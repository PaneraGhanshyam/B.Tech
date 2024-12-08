import java.util.Scanner;

public class AvrageOfN{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int sum=0;

        System.out.print("Enter size:");
        int size=inp.nextInt();

        for(int i=0;i<=size;i++)
        {
            sum=sum+i;
        }
        double avg=(double)sum/size;
        System.out.print("Avrage is "+avg);
        inp.close();

    }
}