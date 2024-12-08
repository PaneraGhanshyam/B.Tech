package OOPJ_LABS.LAB_7;
import java.util.Scanner;

public class LAB7_5 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setMemberDetails();
        e.setEmpDetails();
        System.out.println("Employee Details : ");
        e.getEmpDetails();
        Manager m=new Manager();
        m.setMemberDetails();
        m.setManDetails();
        System.out.println("Manager Details : ");
        m.getManDetails();
    }
}
class Member{
    String name;
    int age;
    int phoneNumber;
    String address;
    double salary;

    public void setMemberDetails(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name=inp.nextLine();
        System.out.println("Enter Age: ");
        this.age=inp.nextInt();
        System.out.println("Enter Phone no: ");
        this.phoneNumber=inp.nextInt();
        System.out.println("Enter Address: ");
        this.address=inp.nextLine();
        System.out.println("Enter Salary: ");
        this.salary=inp.nextDouble();
        inp.close();
    }

    public double printSalary(){
        return this.salary;
    }
}
class Employee extends Member{
    String sp;

    public void setEmpDetails(){
        Scanner inp=new Scanner (System.in);    

        System.out.println("Enter Specialization :");
        this.sp=inp.nextLine();

        inp.close();
    }
    public void getEmpDetails(){   
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone No: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Specialization: "+sp);
    }
}
class Manager extends Member{
    String dept;

    public void setManDetails(){
        Scanner inp=new Scanner (System.in);    

        System.out.println("Enter Department :");
        this.dept=inp.nextLine();

        inp.close();
    }
    public void getManDetails(){   
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone No: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+dept);
    }
}


