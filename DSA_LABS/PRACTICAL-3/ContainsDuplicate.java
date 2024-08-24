import java.util.Scanner;

public class ContainsDuplicate{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int size;

        System.out.print("Enter size of array:");
        size=inp.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }

        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j])
                {
                    count++;
                    break;
                }
            }
        }
        if(count!=0){
            System.out.print("Duplicate elemenent found.");
        }else{
            System.out.print("Duplicate element not found.");
        }
        inp.close();

    }
}