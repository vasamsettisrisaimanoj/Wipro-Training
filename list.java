import java.util.List;
import java.util.ArrayList;
public class list{
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        //adding elements
        names.add("Alice");
        names.add("john");
        names.add("Steve");
        names.add("Hari");
        names.add("Mani");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        System.out.println(names.get(1));
        names.set(1,"Manoj");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Manoj"));
        System.out.println(names.indexOf("Alice"));
        names.clear();
        System.out.println(names);
    }
}