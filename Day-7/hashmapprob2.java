import java.util.HashMap;
import java.util.Map;

public class hashmapprob2 {
    public static void main(String[] args) {
        String str = "programming";
        char[] chr = str.toCharArray();
        Map <Character,Integer> res = new HashMap<>();
        for(Character c:chr){
            if(res.containsKey(c)){
                res.put(c,res.get(c)+1);
            }else{
                res.put(c,1);
            }
        }
        System.out.println(res);
    }
}
