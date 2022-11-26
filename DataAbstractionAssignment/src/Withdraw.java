import java.util.Date;

public class Withdraw {
    //variables
    private double amount;
    private Date date;
    private String account;
    private double balance;
//constructor with parameters
    Withdraw(double amount, String account,double balance){
        this.amount = amount;
        this.date = new Date();
        this.account = account;
        this.balance = balance;
    }
    //requires:Withdraw object
    //modifies: this
    //effects: Converts Withdraw value to a string
    public String toString(){
        return("Withdrawal of: $"+ this.amount+ " Date: "+ this.date+ " from account: " + this.account + " Current Balance in " + this.account+ " is: $" + balance);
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
