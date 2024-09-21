import java.util.Scanner;

class StudentDetail {
    int enrollmentNo;
    String name;
    int semester;
    double cpi;

    public StudentDetail(int enrollmentNo, String name, int semester, double cpi) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Enrollment No: " + enrollmentNo + ", Name: " + name +
               ", Semester: " + semester + ", CPI: " + cpi;
    }
}

public class StudentDetailsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDetail[] students = new StudentDetail[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            int enrollmentNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Semester: ");
            int semester = scanner.nextInt();

            System.out.print("CPI: ");
            double cpi = scanner.nextDouble();

            students[i] = new StudentDetail(enrollmentNo, name, semester, cpi);
        }

        System.out.println("\nStudent Details:");
        for (StudentDetail student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
