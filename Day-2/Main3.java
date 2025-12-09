import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String dup = "";
        for(int i=0;i<str.length();i++){
            for(int j=0; j<dup.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                    dup = dup + str.charAt(i);
                }
            }
        }
        int max =0,count=0;
        for(int i=0; i<dup.length();i++) {
            count = 0;
            for(int j=0;j<str.length();j++){
                if(dup.charAt(i)==str.charAt(j)){
                    count+=1;
                }
            }
            if(max<count){
                max=count;
            }
        }
        System.out.println(count);
    }
}
