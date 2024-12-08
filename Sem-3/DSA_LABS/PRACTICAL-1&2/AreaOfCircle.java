import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter radius:");
        double r=inp.nextDouble();

        double area=Math.PI*r*r;

        System.out.print(String.format("Area of circle is:%.4f",area));

        inp.close();
    }
}
