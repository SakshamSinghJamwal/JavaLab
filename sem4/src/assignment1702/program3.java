package assignment1702;
import java.util.Scanner;

public class program3 {
    public static class OPerations {
        private int num1;
        private int num2;
        public void setDim(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        public int addop() {
            return num1 + num2;
        }
        public int subop() {
            return num1 - num2;
        }
        public int multiop() {
            return num1 * num2;
        }
        public int divop() {
        	if(num2==0) {
               return 0;
        	}
        	return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        OPerations op = new OPerations();
        op.setDim(num1, num2);
        System.out.println("Sum: " + op.addop());
        System.out.println("Subtraction: " + op.subop());
        System.out.println("Multiplication: " + op.multiop());
        System.out.println("Division: " + op.divop());
        scanner.close();
    }
}
