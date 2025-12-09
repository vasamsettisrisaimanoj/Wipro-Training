import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Ajay",36);
        marks.put("Ganesh",70);
        marks.put("Aneeth",65);
        System.out.println(marks);
        System.out.println(marks.get("Ajay"));
        System.out.println(marks.remove("Ajay"));
        System.out.println(marks);
        System.out.println(marks.containsKey("Ganesh"));
        System.out.println(marks.containsValue(65));
        System.out.println(marks.size());
        marks.clear();
        System.out.println(marks);
    }
}
