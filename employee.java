public class employee{
    String name="Unknown",dept="Unknown";
    int salary=0;
    public employee(){
        System.out.println("employee doesn't have any details");
    }
    public employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    public employee(String name,int salary,String dept){
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
    void display(){
        System.out.println("name -"+name);
        System.out.println("salary -"+salary);
        System.out.println("department -"+dept);
    }
    public static void main(String[] args){
        employee emp1 = new employee("john",20000,"Testing");
        emp1.display();
        employee emp2 = new employee("Greesh",20000);
        emp2.display();

    }
}