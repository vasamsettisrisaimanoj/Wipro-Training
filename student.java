class stu{
    private String name;
    private int marks;

    public void setmarks(int marks){
        this.marks = marks;
    }
    public int getmarks(){
        return marks;
    }
}
class student{
    public static void main(String[] args){
        stu s = new stu();
        s.setmarks(20);
        System.out.println(s.getmarks());
    }
}