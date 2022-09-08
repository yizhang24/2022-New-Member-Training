public class Quadratic2 {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 1;

        // Calculate Discriminant
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.print("Two Roots");
        } else if (d < 0) {
            System.out.print("No Roots");
        } else {
            System.out.print("One Root");
        }
    }
}
