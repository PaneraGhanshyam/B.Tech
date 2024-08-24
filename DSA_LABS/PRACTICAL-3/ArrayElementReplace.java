import java.util.Scanner;

public class ArrayElementReplace{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

        int size=0;
        System.out.print("Enter size:");
        size=inp.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }

        System.out.print("Enter number 1:");
        int n1=inp.nextInt();

        System.out.print("Enter number 2:");
        int n2=inp.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==n1){
                arr[i]=n2;
            }
        }

        System.out.print("Array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        inp.close();
    }
}