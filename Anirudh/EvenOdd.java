public class EvenOdd {
    public static void main(String[] args) {
        int check = val(1);
        check %= 2.0;
        if (check == 0) {
            System.out.println("Even") ;
            

        }
        else{
            System.out.println("odd") ;    
            }
    }

    public static int val(int uno) {
        uno += 1;
        return uno;
    }

}
