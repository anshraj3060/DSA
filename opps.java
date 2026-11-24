class Bank{
    int accountno;
    String name;
    int balance;
    Bank(){ //default
        this.accountno=9798;
        this.name="Ansh Raj";
        this.balance=1000;
    }
    Bank(int acc, String nm, int bal){
        this.accountno=acc;
        this.name=nm;
        this.balance=bal;
    }
    void display(){
        System.out.println(this.accountno+" "+this.name+" "+this.balance);
    }
}
public class opps {
    public static void main(String[] args) {
        Bank b1=new Bank(123, "vv", 1234);
        b1.display();
    }
}
