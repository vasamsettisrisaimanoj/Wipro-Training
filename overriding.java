class person{
    void displayinfo(){
        System.out.println("This is a person");
    }
}
class student extends person{
    String name;
    int rollno;
    student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    void displayinfo(){
        System.out.println(name +" is a student and his roll no is "+rollno);
        super.displayinfo();
    }
}
public class overriding{
    public static void main(String[] args){
        student s = new student("manoj",53);
        s.displayinfo();
    }
}