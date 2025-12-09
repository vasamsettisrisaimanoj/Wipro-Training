import java.util.HashMap;
import java.util.Map;

public class hashmaprob1 {
    public static void main(String[] args) {
        String str = "What a beautiful day it is with a beautiful weather";
        String[] words = str.toLowerCase().split(" ");
        Map<String, Integer> res = new HashMap<>();
        for(String word:words){
            if(res.containsKey(word)){
                res.put(word,res.get(word)+1);
            }else{
                res.put(word,1);
            }
        }
        System.out.println(res);
    }
}
