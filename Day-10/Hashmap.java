import java.util.*;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap <String,Integer> map = new HashMap<>();
        String[] words = str.toLowerCase().split(" ");
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}
