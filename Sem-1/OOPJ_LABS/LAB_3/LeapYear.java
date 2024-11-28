package LAB_3;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int year=0;

        System.out.print("Enter Year:");
        year=inp.nextInt();

        if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            System.out.print(year+" Is Leap Year.");
        else
            System.out.print(year+" Is Not Leap Year.");

        inp.close();
    }
}
