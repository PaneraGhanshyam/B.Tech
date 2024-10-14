public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {89,64, 34, 25, 5,12, 22,65,3};

        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }   
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.err.print("Array is : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
