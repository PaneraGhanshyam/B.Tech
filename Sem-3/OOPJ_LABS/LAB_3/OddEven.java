package LAB_3;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter first number:");
        int n1=inp.nextInt();
        System.out.print("Enter second number:");
        int n2=inp.nextInt();

        System.out.println("Max is: "+(( n1 > n2 ) ? n1 : n2));

        inp.close();
    }
    
}