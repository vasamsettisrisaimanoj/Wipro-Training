import java.lang.*;
public class Armstrong {
    public static void main(String[] args) {
        for(int i=0;i<=10000;i++){
            if(isArmstrong(i)){
                System.out.println("Armstrong number :"+i);
            }
        }
    }
    public static boolean isArmstrong(int i){
        int num = i,arm = 0,digit=0;
        int noofDigits = String.valueOf(num).length();
        while(num > 0){
            digit = num %10;
            arm = arm + (int)Math.pow(digit, noofDigits);
            num = num /10;
        }
        return i==arm;
    }
}
