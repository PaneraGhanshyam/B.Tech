package LAB_4;

import java.util.Scanner;

public class PrintSecondHalfOfString {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter string: ");
        String s=inp.nextLine();

        int len=s.length();
        len=len/2;

        System.out.print("Second half is : "+s.substring(len));
        
        inp.close();
    }
}
