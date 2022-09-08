public class quadratics {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = 0;
        double d = b*b-4*a*c;
        if (d == 0) {
            System.out.println("One root");
        } else if (d > 0) {
            System.out.println("Two roots");
        } else {
            System.out.println("Zero roots");
        }
    }
}