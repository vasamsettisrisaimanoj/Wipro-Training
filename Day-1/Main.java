import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if(digit%2==0){
            System.out.println("No is Even");
        }else{
            System.out.println("No is odd");
        }
    }
}