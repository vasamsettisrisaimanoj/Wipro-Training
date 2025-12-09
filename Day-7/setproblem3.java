import java.util.HashSet;
import java.util.List;
public class setproblem3 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3);
        List<Integer> l2 = List.of(4,5,6);

        HashSet<Integer> s1 = new HashSet<>(l1);
        boolean Nocommon = true;
        for(int ele:l2){
            if(s1.contains(ele)){
                Nocommon = false;
                break;
            }
        }
        System.out.println(Nocommon);
    }
}
