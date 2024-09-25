package OOPJ_LABS.LAB_6;

import java.util.Scanner;
public class LAB6_4 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        BankAccount b=new BankAccount();

        System.out.print("Enter account no : ");
        long accNo=inp.nextLong();
        inp.nextLine();
        System.out.print("Enter user name :");
        String userName=inp.nextLine();
        System.out.print("Enter email : ");
        String email=inp.nextLine();
        System.out.print("Enter account type : ");
        String accType=inp.nextLine();
        System.out.print("Enter account balance : ");
        double balance=inp.nextDouble();

        b.setAccountDetails(accNo, userName, email, accType, balance);
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

    public void setAccountDetails(long accNo,String userName,String email,String accType,double accBal){
        this.accNo=accNo;
        this.userName=userName;
        this.email=email;
        this.accType=accType;
        this.accBal=accBal;
    }

    public void getAccountDetails(){
        System.out.println("\nAccount number is : "+accNo);
        System.out.println("User name is :"+userName);
        System.out.println("Email : "+email);
        System.out.println("Account type : "+accType);
        System.out.println("Account balance : "+accBal);
    }
}