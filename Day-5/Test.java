
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
            if(99%num==0){
                System.out.println(num+" is a factor of 99");
            }else{
                System.out.println(num+" is a not a factor of 99");
            }
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception java.lang.ArithmeticException: / by zero");
        }catch(Exception e){
            System.out.println("Number Format Exception java.lang.NumberFormatException: For input string: \"" + sc.next() + "\"");
        }
    }
}