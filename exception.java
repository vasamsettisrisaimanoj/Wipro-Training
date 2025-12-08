public class exception{
    public static void main(String[] args) {
        int a = 5,b=0;
        try{
            int result = a/b;
        }catch(ArithmeticException e){
                System.out.println("Error is occured");
        }
       int [] arr = {1,2,3,4,5};
       try{
            System.out.println(arr[10]);
       }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is occured ");
       }finally{
            System.out.println("Final Block is Excuted");
       }
    }
}