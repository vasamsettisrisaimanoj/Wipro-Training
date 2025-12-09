import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = ((a>b) && (a>c)) ? a: ((b>c) && (b>a)) ? b :c  ;
        System.out.println("largest number is "+result);
        sc.close();
    }
}   
