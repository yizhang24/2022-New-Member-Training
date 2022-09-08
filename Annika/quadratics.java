public class quadratics {
    public static void main(String[] args ) {
        int a = 6;
        int b = 4;
        int c = 12;
        int root = b^2-4*a*c;
        if (root >= 0);{
            System.out.println( "no root exists" );
        }
        else if (root == 0); {
            System.out.println ("1 root exists" );
        }
        else {
            System.out.println ("2 roots exists");
        }
    }

}