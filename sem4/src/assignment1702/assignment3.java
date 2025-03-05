package assignment1702;
import java.util.Scanner;

public class assignment3 {
    public static class Cube {
        double side;
        public void setDim(double side) {
            this.side = side;
        }
        public double getVolume() {
            return side * side * side;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of cube: ");
        double side = scanner.nextDouble();
        Cube c = new Cube();
        c.setDim(side);
        System.out.println("The volume of the cube is: " + c.getVolume());
        scanner.close();
    }
}
