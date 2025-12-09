import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashmapprob3 {
    public static void main(String[] args) {
        Map<Integer,String> fruits = new HashMap<>();
        fruits.put(3,"Banana");
        fruits.put(1,"Apple");
        fruits.put(2,"Cherry");

        Map<Integer,String> res = new TreeMap<>(fruits);
        System.out.println(res);
    }
}
