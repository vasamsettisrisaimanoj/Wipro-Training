import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class problem2 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        List<String> lst = List.of("java","is","fun");
        for(String ele:lst){
            StringBuilder strb = new StringBuilder(ele);
            String revstr = strb.reverse().toString();
            str.add(revstr);
        }
        Collections.reverse(str);
        System.out.println(str);
    }
}
