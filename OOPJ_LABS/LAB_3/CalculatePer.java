package LAB_3;

import java.util.Scanner;

public class CalculatePer {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double sum=0;
        for(int i=0;i<5;i++){
            System.out.print("Enter subject "+(i+1)+" marks : ");
            sum += inp.nextDouble();
        }

        double per=sum/5;

        if(per>=60)
            System.out.println("First division.");
        else if(per>=50 && per<=59)
            System.out.println("Second division.");
        else if(per>=40 && per<=49)
            System.out.println("Third division.");
        else
            System.out.println("Fail.");
        inp.close();
    }
}
