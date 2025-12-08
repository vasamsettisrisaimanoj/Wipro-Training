public class typecasting{
    public static void main(String[] args){
        //Widening casting
        int num = 5;
        double dob = num;
        System.out.println("number :"+num);
        System.out.println("double :"+dob);
        //Narrow casting
        double doub = 7.5;
        int integer = (int)doub;
        System.out.println("double :"+doub);
        System.out.println("number :"+integer);
        
    }
}