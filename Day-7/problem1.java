import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class problem1{
    public static void main(String[] args){
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        List <Integer> duplst = new ArrayList<>();
        for(Integer ele : list){
            if(!duplst.contains(ele)){
                duplst.add(ele);
            }
        }
        Collections.sort(duplst);
        System.out.println(duplst);
        System.out.println("Second largest element : "+duplst.get(duplst.size()-2));
        
    }
}