public class Prime {

    public static void main(String[] args) {

        for(int i = 1; i <= 50; i++) {
            //System.out.println(i)

            //whether we think a number is prime
            boolean isPrime = true;
            //check it against another set of numbers
            for (int j = 2; j < i / 2.0; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                    }

                }

                if (isPrime == true ) {
                   System.out.println(i + " is prime!");
                }
                
                }
            
            }
        }
    

