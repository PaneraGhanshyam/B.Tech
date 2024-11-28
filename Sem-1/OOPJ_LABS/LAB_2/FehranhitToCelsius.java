import java.util.Scanner;

public class FehranhitToCelsius{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        double cel,feh;

        System.out.print("Enter celsius:");
        cel=inp.nextInt();

        feh=(cel*(9.0/5.0))+32;
        cel=(feh-32)*(5.0/9.0);

        System.out.println("Fehranhit: "+feh);
        System.out.print("Celsius: "+cel);

        inp.close();

    }
    
}