import java.util.HashSet;
import java.util.List;

public class setproblem1 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4);
        List<Integer> list2 = List.of(3,4,5,6);
        
        HashSet<Integer> rset = new HashSet<>();
        
        for(Integer ele:list1){
            if(list2.contains(ele)){
                rset.add(ele);
            }
        }
        System.out.println(rset);
    }
    
}
