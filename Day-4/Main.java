public class Main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.noOfWheels();
        Scooter sco = new Scooter();
        sco.noOfWheels();
        Car c = new Car();
        c.noOfWheels();
        
    }
}
class Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels undefined");
    }
}
class Scooter extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 2");
    }
}
class Car{
    void noOfWheels(){
        System.out.println("No of wheels 4");
    }
}
