import java.util.ArrayList;

public class Average {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
           int num = list.size() ;
           int count = 0 ;
           double av = 0 ;
           while(num > count){
                av += list.get(count) ;           
                count += 1 ;
           }
           av /= num ;
           System.out.println(av) ;



    } 
}
