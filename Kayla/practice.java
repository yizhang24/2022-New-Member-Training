public class practice {
    public static void main(String[] args) {
        double a = 9;
        double b = 4; 
        double c = 0;

        //this is the discriminant. 
        double d = (b*b - 4*a*c); 

        if (a == 0) {
            //if a is equal to 0, the equation is not a quadratic. 
            System.out.println("not a quadratic"); 
        } else {
             //opens up or down? 
             if (a > 0) {
                  System.out.println("opens up");
             } else if (a < 0) {
                 System.out.println("opens down");
                } 

             //how many roots?
             if (d == 0) {
                  System.out.println("1 root");
             } else if (d > 0) {
                  System.out.println("2 roots");
             } else {
                  System.out.println("no roots");
              }
          }
        }
}
