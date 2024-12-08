package OOPJ_LABS.LAB_6;
import java.util.Scanner;
public class LAB6_1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=inp.nextDouble();

        Area a=new Area();

        System.out.println(a.area(r));
        inp.close();
    }
}
class Area{
    public double area(double r){
        return 3.14*r*r;
    }
}