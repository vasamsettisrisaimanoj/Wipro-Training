public class wrapper{
    public static void main(String[] args){
        int a = 5;
        Integer num = a;//Boxing;
        System.out.println("After Boxing :"+num);
        Integer number = 20;
        int n = number;//Unboxing;
        System.out.println("After Unboxing:"+n);

        char c1 = 'A';
        Character c2 = c1; //Boxing
        System.out.println("After Boxing :"+c2);
        Character c3 = 'B';
        char c4 = c3;//UnBoxing
        System.out.println("After Unboxing:"+c4);

    }
}