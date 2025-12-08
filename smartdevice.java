interface camera{
    void clickPhoto();
}
interface phone{
    default void makeCall(){
        System.out.println("Calling ");
    }
}
class Mobile implements camera,phone{
    public void clickPhoto(){
        System.out.println("Clicking picture");
    }
}
public class smartdevice{
    public static void main(String[] args){
        Mobile m = new Mobile();
        m.clickPhoto();
        m.makeCall();
    }
}