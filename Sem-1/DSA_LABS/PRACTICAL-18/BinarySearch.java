
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={5,10,40,50,55,67,89,99};
        int right=arr.length-1;
        int left=0;
        boolean flag=false;
        int x=99;

        // while(left<=right){
        //     int mid=(right+left)/2;

        //     if (arr[mid]==x) {
        //         System.out.println("Element found at index : "+mid);
        //         flag=true;
        //         break;        
        //     }else if(x<arr[mid]){
        //         right=mid-1;
        //     }else{
        //         left=mid+1;
        //     }
        // }
        

        flag=binarySearch(x, arr, left, right);
        if (!flag) {
            System.out.println("Element not found.");
        }
    }    
    public static boolean binarySearch(int x, int arr[], int left, int right) {
        if (left > right) {
            return false; 
        }

        int mid = (left + right) / 2;

        if (arr[mid] == x) {
            System.out.println("Element found at index: " + mid);
            return true;
        } else if (arr[mid] < x) {
            return binarySearch(x, arr, mid + 1, right); 
        } else {
            return binarySearch(x, arr, left, mid - 1); 
        }
    }
}
