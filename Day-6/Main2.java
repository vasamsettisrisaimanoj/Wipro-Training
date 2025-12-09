import java.util.Scanner;
// Java program to remove
// elements from HashMap
import java.io.*;
import java.util.*;
public class Main2 {

    public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        Map <Integer,String> maps = new HashMap<>();
        maps.put(1,s.next());
        maps.put(2,s.next());
        maps.put(3,s.next());
        maps.put(4,s.next());
        int remove = s.nextInt();
        System.out.println("Mappings of HashMap are : "+ maps);
        maps.remove(remove);
        System.out.println("Mappings after removal are : "+ maps);
    }
}
