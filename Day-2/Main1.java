import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] sentences = text.split(" ");
        StringBuilder str_rev = new StringBuilder();
        String res ="";
        for(int i=0; i<sentences.length;i++){
            StringBuilder str = new StringBuilder(sentences[i]);
            str_rev.append(str.reverse());
            if(i!=sentences.length){
                str_rev.append(" ");
            }
        }
        System.out.println(str_rev);
        sc.close();
        
    }
}