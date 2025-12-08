class vehicle{
    void methodvehicle(){
        System.out.println("It is Vehicle");
    }
}
class car extends vehicle{
    void methodcar(){
        System.out.println("It is Car");
    }
}
public class singleinheritence {
    public static void main(String[] args){
        car c = new car();
        c.methodvehicle();
        c.methodcar();
        vehicle v = new vehicle();
        v.methodvehicle();
    }
}