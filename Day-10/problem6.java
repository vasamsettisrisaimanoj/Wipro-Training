import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a==b) && (b==c)){
            System.out.println("All are Same");
        }else if((a==b) || (b==c) || (c==a)){
            System.out.println("Two are Equal");
        }else{
            System.out.println("All are different");
        }
    }   
}
