package OOPJ_LABS.LAB_6;
import java.util.Scanner;

public class LAB6_5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter value of R1 : ");
        float r1=inp.nextFloat();

        System.out.print("\nEnter value of R2 : ");
        float r2=inp.nextFloat();

        System.out.print("\nEnter value of I1 : ");
        float i1=inp.nextFloat();

        System.out.print("\nEnter value of I2 : ");
        float i2=inp.nextFloat();

        //Complex c1=new Complex();
        //Complex c2=new Complex();
        Complex c3=new Complex(r1,i1);
        Complex c4=new Complex(r2,i2);
        c3.calculate(c4);

        inp.close();
    }
}
class Complex{
    float r,i;
    public Complex(){
        r=i=0;
    }
    public Complex(float r,float i){
        this.r=r;
        this.i=i;
    }
    public void calculate(Complex c){
        System.out.println("R : "+(this.r+c.r));
        System.out.println("I : "+(this.i+c.i));
    }
}
