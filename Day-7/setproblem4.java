import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class setproblem4 {
    public static void main(String[] args) {
        String str = "swiss";
        HashSet<Character> nonrep = new HashSet<>();
        List<Character> rep = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            nonrep.add(str.charAt(i));
            rep.add(str.charAt(i));
        }
        int count =0;
        for(Character ele1:nonrep){
            count = 0;
            for(Character ele2:rep){
                if(ele1 == ele2){
                    count+=1;
                }
            }
            if(count == 1){
                System.out.println(ele1);
                break;
            }
        }
    }
}
