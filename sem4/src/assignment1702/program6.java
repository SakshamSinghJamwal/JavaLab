package assignment1702;
import java.util.Scanner;

public class program6 {
    public static class ATM {
        int amount;
        int withdrawal;
        public void setDetails(int amount, int withdrawal) {
            this.amount = amount;
            this.withdrawal = withdrawal;
        }

        public void balance() {
            if (withdrawal > amount) {
                System.out.println("Not enough balance");
            } else {
                amount -= withdrawal; 
                System.out.println("Withdrawal = " + withdrawal);
                System.out.println("Remaining Balance = " + amount);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        int amount = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdrawal = scanner.nextInt();
        ATM a1 = new ATM();
        a1.setDetails(amount, withdrawal);  
        a1.balance();

        scanner.close();
    }
}
