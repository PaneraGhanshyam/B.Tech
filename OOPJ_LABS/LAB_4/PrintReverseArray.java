package LAB_4;

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size=inp.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i=0;i<size;i++)
            arr[i]=inp.nextInt();


        System.out.print("Reverse array is: ");
        for(int i=size-1;i>=0;i--)
            System.out.print(arr[i]+" ");

        inp.close();
    }
}
