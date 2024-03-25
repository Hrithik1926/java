package Practice1;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double determinant = b * b - 4.0 * a * c;

        if (determinant > 0.0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2.0 * a);
            System.out.format("The roots are %.2f and %.2f%n", root1, root2);
        } else if (determinant == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.format("The root is %.2f%n", root1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}


