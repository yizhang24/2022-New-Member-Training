public class MaxValue {
     public static void main(String[] args) {
        int[] array = {0,1,2} ;
        int ph = 0 ;
        int p1 = 0 ;
        while(p1 <= 2){
            if(ph <= array[p1]){
                ph += array[p1] ;
                p1 += 1 ;
            }
        }  
        System.out.println(ph) ;
    }}