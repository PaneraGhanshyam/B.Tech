import java.util.Scanner;

public class MeterIntoFeet{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter meter:");
        Double meter=inp.nextDouble();

        Double feet=meter*3.2808399;

        System.out.println("Feet is :"+feet);
        
        inp.close();
    }
}