import java.util.HashSet;

public class setproblem2 {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        String[] words = str.split(" ");
        HashSet <String> set1 = new HashSet<>();
        for(String ele:words){
            set1.add(ele);
        }
        System.out.println("Size of unique elements in string is "+set1.size());
    }
}
