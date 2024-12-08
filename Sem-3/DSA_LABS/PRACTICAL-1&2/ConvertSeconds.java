import java.util.Scanner;
public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter seconds:");
        int s=inp.nextInt();

        int h=s/3600;
        s=s%3600;

        int m=s/60;
        s=s%60;

        System.out.printf("HH:MM:SS\n%02d:%02d:%02d\n",h,m,s);

        inp.close();
    }    
}
