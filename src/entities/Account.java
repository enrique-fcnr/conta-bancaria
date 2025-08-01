package entities;

public class Account {

   //ATRIBUTES
    private int number;
    private String holder;
    private double balance;

    //CONSTRUCTORS
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //GETTERS AND SETTERS
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    //METHODS

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.00;
    }


    public String toString(){
       return "Number: " + number
               + ", Holder: " + holder
               + ", Balance: $" + String.format("%.2f", balance);
    }

}
