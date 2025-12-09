import java.util.Scanner;
public class probelm9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if( ch >='A' && ch<='Z'){
            System.out.println("It is Uppercase Letter");
        }else if(ch>='a' && ch<='z'){
            System.out.println("It is a LowerCase");
        }else if(ch>='0' && ch<='9'){
            System.out.println("It is a Number");
        }else{
            System.out.println("It is a Special Character");
        }
    }
}
