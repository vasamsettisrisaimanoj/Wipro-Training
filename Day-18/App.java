class Manager{
 
public void taskAllocation(String user){
    System.out.println("Task is allocated by : Manager ");
    }
 
}
 
class Delegate{
 
private Manager m = new Manager(); // hard -code dependecy
 
public notifyUser()
{
m.taskAllocation("Niti");
}
 
}
 
public class App
{
public static void main(String[] args)
{
Delegate d = new Delegate();
d.notifyUser();
}
}