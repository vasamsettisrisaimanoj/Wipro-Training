import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        System.out.println("List before sort: "+arr);
        Collections.sort(arr);
        System.out.println("List after sort: "+arr);
    }
}
