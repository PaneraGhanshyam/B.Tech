package OOPJ_LABS.LAB_7;
import java.util.Scanner;

public class LAB7_1 {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);  
        Student s[]=new Student[Integer.parseInt(args[0])];     

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.print("Enter Student "+(i+1)+" Rno : ");
            int rno=inp.nextInt();
            inp.nextLine();
            System.out.print("Enter Student "+(i+1)+" Name : ");
            String nm=inp.nextLine();
            s[i]=new Student(rno,nm,inp);
            s[i].getSubjectDetails();
            s[i].calculateSpi();
            s[i].displayResult();
        }

        inp.close();
    }    
}
class Student{
    private int rno;
    private String name;
    private String sub[]={"DBMS","OOP","FOA","WT"};
    private int def_credit[]={6,5,5,6};
    private int marks[]=new int[sub.length];
    private double tot_credit=22;
    private double sum_points=0;
    private double spi;
    private Scanner inp;

    Student(int rno,String name,Scanner inp){
        this.name=name;
        this.rno=rno;
        this.inp=inp;
    }
    void getSubjectDetails(){
        System.out.println("\n\n");
        for (int i = 0; i < sub.length; i++) {
            System.out.print("Enter marks of "+sub[i]+" : ");
            marks[i]=inp.nextInt();
            sum_points += calculateGradePoints(marks[i], def_credit[i]);
            this.spi=calculateSpi();
        }
    }
    double calculateGradePoints(int marks,int credit){
        if (marks>=90) {
            return 10*credit;
        }else if(marks>=80 && marks<90){
            return 9*credit;
        }else if(marks>=70 && marks<80){
            return 8*credit;
        }else if(marks>=60 && marks<70){
            return 7*credit;
        }else if(marks>=50 && marks<60){
            return 6*credit;
        }else if(marks>=40 && marks<50){
            return 4*credit;
        }else{
            return 0;
        }
    }
    double calculateSpi(){
        return sum_points/tot_credit;
    }
    void displayResult(){
        System.out.println("\n\nEnrollment No : "+rno);
        System.out.println("Name : "+name);
        System.out.println("SPI : "+spi);
    }
}
