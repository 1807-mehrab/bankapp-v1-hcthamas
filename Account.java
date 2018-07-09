import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int ID;
    private double balance;
    private short passcode;

    public Account() {}
    public Person(String name, int ID, double balance, short passcode) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
        this.passcode = passcode;
    }

   public fullDetail(){
       System.out.println(name);
       System.out.println(ID);
       System.out.println(balance);
   }

   public String getName(){
       return this.name;
   }

   public int getID(){
       return this.ID;
   }

   public double getBalance(){
       return this.balance;
   }

   public short getPasscode(){
       return passcode;
   }

   public boolean checkPasscode(short passcode){
       return(this.passcode == passcode);
   }

   public void withdraw(float amount){
       this.balance = this.balance - amount;
   }

   public void deposit(float amount){
       this.balance = this.balance + amount;
   }
}