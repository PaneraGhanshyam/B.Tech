import java.util.Scanner;

public class ReadNNumbers{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter size:");
        int size=inp.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr[i]=inp.nextInt();
        }
        System.out.print("Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        inp.close();
    }
}