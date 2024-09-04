import java.util.Scanner;
public class PR7 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size=inp.nextInt();

        int array[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            array[i]=inp.nextInt();
        }
        
        System.out.print("Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        
        System.out.print("Enter index:");
        int index=inp.nextInt();

        int array2[]=new int[size];
        for(int i=index,j=0;i<size;i++,j++){
            array2[j]=array[i];
            array[i]=0;
        }
        for(int i=0,j=index+1;array[i]!=0;i++,j++){
            array2[j]=array[i];
        }

        System.out.print("New array is : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+",");
        }

        inp.close();
    }
}
