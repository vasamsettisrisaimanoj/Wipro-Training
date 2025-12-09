import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class queueproblem {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        List<Integer> list = new ArrayList<>(queue);
        queue.clear();
        for(int i=list.size()-1;i>=0;i--){
            queue.add(list.get(i));
        }
        System.out.println(queue);

        
    }
    
}
