package assignment1702;
import java.util.Scanner;

public class program5 {
    public static class Student {
        String name;
        String sem;
        String branch;
        public void setDetails(String name, String sem, String branch) {
            this.name = name;
            this.sem = sem;
            this.branch = branch;
        }
        public void getDetails() {
            System.out.printf("Name = %s\nSem = %s\nBranch = %s", name,sem,branch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter sem: ");
        String sem = scanner.nextLine();
        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();
        Student s1 = new Student();
        s1.setDetails(name, sem, branch);
        s1.getDetails();
        scanner.close();
    }
}
