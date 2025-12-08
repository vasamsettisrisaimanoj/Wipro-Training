class Box {
    private Object item;  
    public void setItem(Object item) {
        this.item = item;
    }
    public Object getItem() {
        return item;
    }
}
public class gene{
    public static void main(String[] args) {
        Box intBox = new Box();
        intBox.setItem(123);  // Autoboxing Integer # Object is class which is inheriting String, 
        Box strBox = new Box();
        strBox.setItem("Hello");
        Integer num = (Integer) intBox.getItem();  
        String str = (String) strBox.getItem();   
        System.out.println("Integer: " + num);
        System.out.println("String: " + str);
        //String wrong = (String) intBox.getItem();   // ClassCastException
    }
}