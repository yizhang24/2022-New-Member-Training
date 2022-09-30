public class Factorial {
 public static void main(String[] args) {
        
    System.out.println(Factorial(4));


    }
    public static int Factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}
