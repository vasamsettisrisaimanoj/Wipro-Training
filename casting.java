class Parent {
    String name;
    void method()
    {
        System.out.println("Parent Method");
    }
}
class Child extends Parent {
    int id;
    void method()
    {
        System.out.println("Child Method");
    }
}
public class casting {
    public static void main(String[] args)
    {
        // Upcasting
        Parent p = new Child();
        p.name = "Manoj";
        System.out.println(p.name);
        p.method();
        //Downcasting
        Child c = (Child)p;
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}