package OOPJ_LABS.LAB_6;
import java.util.Scanner;
public class LAB6_2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter hour-1 : ");
        int h1=inp.nextInt();

        System.out.print("Enter hour-2 : ");
        int h2=inp.nextInt();

        System.out.print("Enter minute-1 : ");
        int m1=inp.nextInt();

        System.out.print("Enter minute-2: ");
        int m2=inp.nextInt();

        
        Time t1=new Time(h1,m1);
        Time t2=new Time(h2,m2);

        t1.add(t1.hour,t2.hour,t1.minute,t2.minute);
        
        inp.close();
    }
}
class Time{
    int hour,minute;

    public Time(int hour,int minute){
        this.minute=minute;
        this.hour=hour;
    }

    public void add(int h1,int h2,int m1,int m2){
        int h=h1+h2+((m1+m2)/60);
        int m=(m1+m2)%60;
        System.out.print("Sum of hours is : "+h);
        System.out.print("\nSum of minutes is : "+m);
    }
}