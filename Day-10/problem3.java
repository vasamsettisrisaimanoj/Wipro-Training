import java.util.LinkedHashMap;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] letters = str.toCharArray();
        for(char letter:letters){
            if(!map.containsKey(letter)){
                map.put(letter,1);
            }
        }
        System.out.println(map);
    }
}
