package assignment1702;
import java.util.Scanner;

public class program2 {
    public static class Area {
        double length;
        double breadth;
        public void setDim(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        public double getArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Area rectangle = new Area();
        rectangle.setDim(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        scanner.close();
    }
}
