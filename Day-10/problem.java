class shape{
    void methodArea(){
        System.out.println("Method in shape");
    }
}
class Rectangle extends shape{
    void methodArea(int l, int b){
        System.out.println("The area of Rectangle is "+l*b);
    }
}
class Circle extends shape{
    void methodArea(int r){
        System.out.println("The area of Circle is "+ r*r*22/7);
    }
}
public class problem {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.methodArea(20,10);
        Circle crcl = new Circle();
        crcl.methodArea(7);
        shape s = new shape();
        s.methodArea();
    }
}