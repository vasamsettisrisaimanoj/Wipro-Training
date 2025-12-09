import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class set {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(8);
        set1.add(5);
        set1.add(9);
        set1.add(3);
        set1.add(null);
        set1.add(2);
        System.out.println(set1);
        set1.remove(5);
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.contains(6));
        set1.clear();
        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(8);
        set2.add(5);
        set2.add(9);
        set2.add(3);
        set2.add(null);
        set2.add(2);
        System.out.println(set2);
        set2.remove(5);
        System.out.println(set2);
        System.out.println(set2.size());
        System.out.println(set2.contains(6));
        set2.clear();
        System.out.println(set2);
        
        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(8);
        set3.add(5);
        set3.add(9);
        set3.add(3);
        set3.add(2);
        System.out.println(set3);
        set3.remove(5);
        System.out.println(set3);
        System.out.println(set3.size());
        System.out.println(set3.contains(6));
        set2.clear();
        System.out.println(set3);
    }
}
