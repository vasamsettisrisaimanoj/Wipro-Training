import java.util.Scanner;
public class practice{
    public static int factorial(int num){
            int fact = 1;
            while(num!=0){
                fact = fact*num;
                num = num-1;
            }
            return fact;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Factorial is "+factorial(num));
        sc.close();
    }
}