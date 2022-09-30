public class Factorial2 {
 public static void main(String[] args) {
        //int[] array = {2, 5, 8};
        //int x =1;
        }
        public static int[] factorial(int[] input) {

            //step 1: create an empty array
            int[] output = new int[input.length];
            //# of output = # of output

            //step 2: update array w/ values
            for(int i = 0; i < output.length; i++) {
                int element = input[i];

                int f = 1; //Tracks should be factorial value

                for ( int j = 1; j <= element; j++) {
                    f = f * i;
                }

                //factorial should be updated

                //step 3: return array
                output[i] = f;
            }

            return output;


        }
    }

