import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        Double l,b;

        System.out.print("Enter length: ");
        l=inp.nextDouble();

        System.out.print("Enter breath: ");
        b=inp.nextDouble();

        System.out.print("Area of rectangle is : "+(l*b));

        inp.close();
    }
}