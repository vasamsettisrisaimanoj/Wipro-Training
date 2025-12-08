class details{
    private String acname;
    private double acbal;
    private String acno;
    public void setname(String acname){
        this.acname = acname;
    }
    public void setacno(String acno){
        if(acno.length()==6){
            this.acno = acno;
        }else{
            System.out.println("Your account number is invalid");
        }
    }
    public String getname(){
        return acname;
    }
    public String getacno(){
        return acno;
    }
    public double getbal(){
        return acbal;
    }
    public void deposit(int deposit){
        acbal += deposit;
    }
    public void withdraw(int withdraw){
        if(acbal - withdraw  < 0){
            System.out.println("Insufficient balance");
        }else{
            acbal -= withdraw;
        }
        
    }
    public void display(){
        System.out.println("Name :"+acname);
        System.out.println("Account-number :"+acno);
        System.out.println("balance :"+acbal);
    }
}
class bankaccount{
    public static void main(String[] args){
        details cust = new details();
        cust.setname("Manoj");
        cust.setacno("685352");
        cust.deposit(500);
        System.out.println(cust.getbal());
        cust.withdraw(200);
        cust.display();
        cust.withdraw(400);
        details cust2 = new details();
        cust2.setacno("2356");
    }
}