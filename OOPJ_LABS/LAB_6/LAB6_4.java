package OOPJ_LABS.LAB_6;

import java.util.Scanner;
public class LAB6_4 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        BankAccount b=new BankAccount();
        b.getAccountDetails();

        inp.close();
    }
}
class BankAccount{
    private long accNo;
    private String userName;
    private String email;
    private String accType;
    private double accBal;

    public BankAccount(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter account no : ");
        this.accNo=inp.nextLong();
        inp.nextLine();
        System.out.print("Enter user name :");
        this.userName=inp.nextLine();
        System.out.print("Enter email : ");
        this.email=inp.nextLine();
        System.out.print("Enter account type : ");
        this.accType=inp.nextLine();
        System.out.print("Enter account balance : ");
        this.accBal=inp.nextDouble();
        inp.close();
    }

    public void getAccountDetails(){
        System.out.println("\nAccount number is : "+accNo);
        System.out.println("User name is :"+userName);
        System.out.println("Email : "+email);
        System.out.println("Account type : "+accType);
        System.out.println("Account balance : "+accBal);
    }
}