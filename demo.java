import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = new String("World!");
        System.out.println("Concatenate :"+s1.concat(" "+s2));
        System.out.println("Accessing :"+s1.charAt(3)+" "+s2.charAt(4));
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.length());
    }
}