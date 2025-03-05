package assignment1702;
import java.util.Scanner;

public class assignment2 {
    public static class Calculate{
        double num1;
        double num2;
        public void set(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        public double add() {
            return num1 + num2;
        }
        public double sub() {
            return num1 - num2;
        }
        public double multi() {
            return num1 * num2;
        }
        public double div() {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        Calculate c1 = new Calculate();
        c1.set(num1, num2);
        System.out.println("Addition = " + c1.add());
        System.out.println("Subtraction = " + c1.sub());
        System.out.println("Multiplication = " + c1.multi());
        System.out.println("Division = " + c1.div());
        scanner.close();
    }
}
