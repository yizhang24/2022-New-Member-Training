public class Quadratics {

    public static void main(String[] args) {
        int a = 3 ;
        int b = 2 ;
        int c = -1 ;
        int roots = b^2 -4*a*c ;
        if( roots == 0){
            System.out.println("1 root") ;
        }
        if(roots > 0)
        {
            System.out.println("Two roots") ;}
        if(roots < 0)
        {
            System.out.println("No roots") ;}
    }
}
