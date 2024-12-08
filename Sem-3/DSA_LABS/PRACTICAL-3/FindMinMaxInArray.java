import java.util.Random;

public class FindMinMaxInArray{
    public static void main(String args[]){
        Random ra=new Random();
        int size=10;
        int large=0,small=0;
        
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=ra.nextInt(1000);
        }

        for(int i=0;i<size;i++){
            System.out.println("Array: "+arr[i]);
        }

        for(int i=0;i<size;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        small=large;
        for(int i=0;i<size;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Max:"+large);
        System.out.println("Min:"+small);

    }
}