public class car {
    public static void main(String[] args) {
        double gas = 13.2;
        double mpg = 31;
        double rangemi = mpg * gas;
        System.out.println(rangemi);
        System.out.println(kilo(rangemi)) ;

    }
    public static double kilo(double rangemi) {
        double rangekms = rangemi * 1.60934 ;
        return rangekms ;
    }

}


