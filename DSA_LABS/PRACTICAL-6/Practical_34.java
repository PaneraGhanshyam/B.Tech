import java.util.Scanner;
public class Practical_34 {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int emp_id;
        String name;
        String designation;
        int salary;

        System.out.print("Enter ID:");
        emp_id=inp.nextInt();

        inp.nextLine();

        System.out.print("Enter Name:");
        name=inp.nextLine();

        System.out.print("Enter Designation:");
        designation=inp.nextLine();

        System.out.print("Enter Salary:");
        salary=inp.nextInt();

        EmployeeDetail emp=new EmployeeDetail(emp_id, name, designation, salary);

        inp.close();
    }
}

class EmployeeDetail {
    private int emp_id;
    private String name;
    private String designation;
    private int salary;

    EmployeeDetail(int emp_id,String name,String designation,int salary){
        this.emp_id=emp_id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;

        this.display();
    }

    void display(){
        System.out.println("ID:"+emp_id);
        System.out.println("Name:"+name);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+salary);
    }
}
