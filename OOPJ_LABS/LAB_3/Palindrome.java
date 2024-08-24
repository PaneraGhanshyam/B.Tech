package LAB_3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s1;

        System.out.print("Enter String:");
        s1=inp.nextLine();

        int size=s1.length();
        boolean flag=true;
        for(int i=0,j=size-1;i<=j;i++,j--){
            if(s1.charAt(i) != s1.charAt(j))
                flag=false;
                break;
        }
        if(flag==false)
            System.out.print("String is not palindrome.");
        else
            System.out.print("String is palindrome.");
        inp.close();
    }    

}
