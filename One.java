import java.util.Scanner;
public class One {
    public static void evenodd(int num){
        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        evenodd(num);
        sc.close();
    }
}
