import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.remove(30));
        System.out.println(queue);
        System.out.println(queue.peek());
        int lastelement = 0;
        for(Integer ele:queue){
            lastelement = ele;
        }
        System.out.println(lastelement);
        
        for(Integer ele:queue){
            System.out.println(ele);
        }
    }
}
