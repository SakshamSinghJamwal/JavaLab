package assignment1702;
import java.util.Scanner;

public class program4 {
    public static class Area {
        double radius;
        public void setDim(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return 3.14*radius*radius;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Area circle = new Area();
        circle.setDim(radius);
        System.out.println("The area of the circle is: " + circle.getArea());
        scanner.close();
    }
}
