package assignment1702;
import java.util.Scanner;

public class program7 {
    public static class Student {
        int studentId;
        String name;
        String branch;
        int sub1Mark, sub2Mark, sub3Mark, sub4Mark, sub5Mark;
        double percent;
        public void setDetails(int studentId, String name, String branch, int sub1Mark, int sub2Mark, int sub3Mark, int sub4Mark, int sub5Mark) {
            this.studentId = studentId;
            this.name = name;
            this.branch = branch;
            this.sub1Mark = sub1Mark;
            this.sub2Mark = sub2Mark;
            this.sub3Mark = sub3Mark;
            this.sub4Mark = sub4Mark;
            this.sub5Mark = sub5Mark;
        }
        public double percentCalculate() {
            percent = (sub1Mark + sub2Mark + sub3Mark + sub4Mark + sub5Mark) / 5.0;
            return percent;
        }
        public void position() {
            percentCalculate();
            System.out.println("\nPercentage: " + percent + "%");

            if (percent >= 91) {
                System.out.println("Position: First Division");
            } else if (percent >= 81) {
                System.out.println("Position: Second Division");
            } else if (percent >= 71) {
                System.out.println("Position: Third Division");
            } else if (percent >= 60) {
                System.out.println("Position: Distinction");
            } else {
                System.out.println("Position: Fail");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = scanner.nextInt();
        System.out.print("Enter marks for Subject 4: ");
        int sub4 = scanner.nextInt();
        System.out.print("Enter marks for Subject 5: ");
        int sub5 = scanner.nextInt();
        Student student = new Student();
        student.setDetails(studentId, name, branch, sub1, sub2, sub3, sub4, sub5);
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + student.studentId);
        System.out.println("Name: " + student.name);
        System.out.println("Branch: " + student.branch);

        student.position(); 

        scanner.close();
    }
}
