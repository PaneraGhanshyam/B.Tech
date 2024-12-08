import java.util.Scanner;

public class UserInput{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter name:");
        String name=inp.nextLine();
        System.out.print("Enter enrollment no:");
        int enroll=inp.nextInt();
        System.out.println("Name is :"+name+"\nEnrollment is:"+enroll);
        
        inp.close();
    }
}