public class blackjack {
    public static void main(String[] args) {
        int[] array = { 18, 19, 26, 16, 20, 23, 13, 30, 15, 28 };
        int num = array.length;
        int count = 0;
        int big = 0;
        while (num > count) {
            if (array[count] > big & array[count] < 21) {
                big = array[count];

            }
            count += 1;
        }
        System.out.println(big);
    }
}
