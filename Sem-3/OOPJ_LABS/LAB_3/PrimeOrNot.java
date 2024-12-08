package LAB_3;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=inp.nextInt();

        int count=0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }

        if(count == 2)
            System.out.println("Number is prime.");
        else
            System.out.println("Number is not prime.");
        inp.close();
    }
}
