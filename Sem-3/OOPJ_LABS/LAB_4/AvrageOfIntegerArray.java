package LAB_4;

import java.util.Scanner;

public class AvrageOfIntegerArray {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int arr[]=new int[4];
        int sum=0;

        for(int i=0;i<4;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=inp.nextInt();
        }

        for(int i=0;i<4;i++)
            sum += arr[i];
        
        System.out.printf("Avrage is :"+(sum/4.00));
        inp.close();
    }
}
