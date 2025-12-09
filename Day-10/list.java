import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>() ;
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        List<Integer> res = new ArrayList<>();
        for(Integer ele:list){
            if(!res.contains(ele)){
                res.add(ele);
            }
        }
        System.out.println(res);
    }
}
