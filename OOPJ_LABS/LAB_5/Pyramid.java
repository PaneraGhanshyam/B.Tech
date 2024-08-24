import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter String:");
        String str = inp.nextLine();
        str2=str.trim();
        System.out.print(str2           );
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}