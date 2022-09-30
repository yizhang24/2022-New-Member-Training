public class functionpractice3 {
    public static void main(String []args) {
       double miles = range(13.2, 31);
       double kilometers = kilometer(miles);
       System.out.println(kilometers);

    }
    static double range (double fuel, double efficiency) {
        return fuel*efficiency;
    }
    static double kilometer (double miles) {
        return miles*1.609344;
    }

}
