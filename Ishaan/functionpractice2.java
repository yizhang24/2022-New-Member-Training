public class functionpractice2 {
    public static void main(String []args){
        int factorial = 1;
        int number = 4;
        for(int i =1, i <=number;i++); {
            factorial = factorial*i
        }
        System.out.println(factorial);

    }
    static int[] factorial(int[] in) {
        int[] output = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            int factorial = 0;
            output[i] = factorial;
        }
        return output;
    }
}
