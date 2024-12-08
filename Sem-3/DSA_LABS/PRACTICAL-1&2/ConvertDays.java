import java.util.Scanner;
public class ConvertDays {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter days:");
        int days=inp.nextInt();

        int years=days/365;
        days=days%365;

        int weeks=days/7;
        days=days%7;

        System.out.print("Years:"+years+"\nWeeks:"+weeks+"\nDays:"+days);

        inp.close();
    }
}
