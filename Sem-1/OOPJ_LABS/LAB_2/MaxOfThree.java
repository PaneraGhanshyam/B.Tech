import java.util.Scanner;

public class MaxOfThree{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n1,n2,n3;

        System.out.print("Enter 1st number: ");
        n1=inp.nextInt();

        System.out.print("Enter 2nd number: ");
        n2=inp.nextInt();

        System.out.print("Enter 3rd number: ");
        n3=inp.nextInt();

        int max= n1>n2 ? n1>n3 ? n1:n3 : n2>n3 ? n2:n3;

        System.err.print("Max is : "+max);

        inp.close();

    }
}