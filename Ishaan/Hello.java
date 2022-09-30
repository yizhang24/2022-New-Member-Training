public class Hello {
   public static void main(String[] args) {
    int base1 = 16;
    int base2 = 7;
    int bases = base1 + base2;
    int h = 8;
    System.out.println("Area = " + bases*h/2);
    int sec = 1678%60;
    int min = (1678-sec)/60;
    System.out.println(min + " minutes " + sec + " seconds");
    int b = 4;
    int m = 2;
    int y = b;
    int x = -b/m;
    System.out.println("y intercept is " + y + " and x intercept is " + x);
    double A = 1;
    double B = 2;
    double C = 1;
    double D = Math.sqrt(B*B-4*A*C);
    double x1 = (-B+D)/(2*A);
    double x2 = (-B-D)/(2*A);
    System.out.println("The solutions are " + x1 + " and " + x2);
   }
}
