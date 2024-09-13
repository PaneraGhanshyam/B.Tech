package OOPJ_LABS.LAB_6;

import java.util.Scanner;
public class LAB6_4 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        inp.close();
    }
}
class BankAccount{
    private int accNo;
    private String userName;
    private String email;
    private String accType;
    private int accBal;

    public void setAccountDetails(int accNo,String userName,String email,String accType,int accBal){
        this.accNo=accNo;
        this.userName=userName;
        this.email=email;
        this.accType=accType;
        this.accBal=accBal;
    }

    public void getAccountDeatils(){
        System.out.println("Account number is : "+accNo);
        System.out.println("User name is :"+userName);
        System.out.println("Email : "+email);
        System.out.println("Account type : "+accType);
        System.out.println("Account balance : "+accBal);
    }
}