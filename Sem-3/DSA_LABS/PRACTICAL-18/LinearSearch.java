
public class LinearSearch{
    public static void main(String[] args) {
        int arr[]={23,1,56,74,65,43,30};
        int x=99;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("Element found at index : "+i);
                flag=true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Element not found.");
        }
    }
}