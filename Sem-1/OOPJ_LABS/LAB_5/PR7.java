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
        int j=index,i=0;
        while(j<array.length){
            array2[i]=array[j];
            i++;
            j++;
        }
        j=0;
        while(j<index){
            array2[i]=array[j];
            i++;
            j++;
        }

        System.out.print("Array2 is : ");
        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k]+",");
        }
        inp.close();
    }
}
