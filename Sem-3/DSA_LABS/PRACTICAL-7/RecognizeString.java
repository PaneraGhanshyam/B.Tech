import java.util.Scanner;
public class RecognizeString {
    static int TOP=-1;
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        String s="";

        System.out.print("Enter String:");
        s=inp.nextLine();

        if (s.equals("")) {
            System.out.println("String is empty.");
        } else {
            char arr[]=new char[s.length()]; 
            recognize(s,arr);
        }

        inp.close();
    }
    static void recognize(String s,char arr[]){
        int i=0;
        while(i<s.length() && s.charAt(i)!='c'){
            if (TOP>=s.length()-1) {
                System.out.println("Stack is overflow.");  
                return;              
            }else{
                TOP++;
                arr[TOP]=Character.toLowerCase(s.charAt(i));
                i++;
            }
        }
        i++;//ignore 'c' 
        while (i<s.length()) { 
            if (TOP==-1 || arr[TOP]!=Character.toLowerCase(s.charAt(i))) {
                System.out.println("Invalid String.");
                return;
            }else{
                TOP--;
                i++;
            }
        }
        if (TOP==-1) {
            System.out.println("Valid String.");
        }else{
            System.out.println("Invalid String.");
        }
    }
}
