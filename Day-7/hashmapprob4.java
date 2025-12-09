import java.util.HashMap;
import java.util.Map;

public class hashmapprob4 {
    public static void main(String[] args) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        map1.put('a',10);
        map1.put('b',20);
        map1.put('c',30);
        map2.put('b',15);
        map2.put('c',25);
        map2.put('d',35);
        for(Character keys:map1.keySet()){
            if(map2.containsKey(keys)){
                map2.put(keys,map2.get(keys)+map1.get(keys));
            }else{
                map2.put(keys,map1.get(keys));
            }
        }
        System.out.println(map2);
    }
}
