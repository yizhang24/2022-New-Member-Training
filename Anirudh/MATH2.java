/**
 * MATH2
 */
public class MATH2 {

    public static void main(String[] args) {
        int total = 1678;
        int insec = total %60 ;
        total -= insec ;
        total /= 60 ;
        String total2 = total + " minutes and " ;
        String total3 = insec + " seconds" ;
        total2 += total3 ;
        System.out.println(total2) ;

    }
}