import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class problem4 {
    public static void main(String[] args) {
        List<Integer> lst1 = List.of(3,5,7,5);
        List<Integer> lst2 = List.of(2,7,8,3);
        List<Integer> mergedlst = new ArrayList<>();
        mergedlst.addAll(lst1);
        mergedlst.addAll(lst2);
        List<Integer> duplst = new ArrayList<>();
        for(Integer ele:mergedlst){
            if(!duplst.contains(ele)){
                duplst.add(ele);
            }
        }
        Collections.sort(duplst);
        System.out.println(duplst);
    }
}
