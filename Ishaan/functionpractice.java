public class functionpractice {
    public static void main(String []args) {
        boolean evenodd = evenodd(77);
        System.out.println(evenodd);
    }
    static boolean evenodd (int a) {
        if (a%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

