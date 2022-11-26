import java.util.Date;

public class Deposit {
    //variables
    private double amount;
    private Date date;
    private String account;
    public double balance;
//constructor with parameters
    Deposit(double amount, String account, double balance){
        this.amount = amount;
        this.date = new Date();
        this.account = account;
        this.balance = balance;
    }
    //requires:Deposit object
    //modifies: this
    //effects: Converts deposit value to a string
    public String toString(){
        return("Deposit of: $"+ this.amount+ " Date: "+ this.date+ " into account: " + this.account + " Current Balance in " + this.account+ " is: $" + balance);
    }
    //getters

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }


    public String getAccount() {
        return account;
    }

}
