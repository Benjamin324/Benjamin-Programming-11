
import java.util.ArrayList;
import java.util.Objects;


public class Customer {
    //fields
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    //default Constructor
    Customer(){
        this.name = null;
        this.accountNumber = 0;
        this.checkBalance = 0;
        this.savingBalance = 0;

    }

    //Constructor with parameters
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.accountNumber = accountNumber;
        this.name = name;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;

    }
    //requires: int, Checking/Saving String
    //modifies: this,deposits
    //effects: adds amt to balance,adds a new deposit entry
    public double deposit(double amt, String account){
        if (account .equals(CHECKING)) {
            checkBalance += amt;
            deposits.add (new Deposit(amt,account,checkBalance));
        }
            else if(account .equals(SAVING) ){
                savingBalance+= amt;
            deposits.add (new Deposit(amt,account,savingBalance));
            }
            else{
            System.out.println("PLEASE ENTER AN APPROPRIATE ACCOUNT!");
        }
        return checkBalance;
    }
    //requires: int, Checking/Saving String
    //modifies: this,withdraws
    //effects: removes amt from balance if there is enough in the account,adds a new withdraws entry
    public double withdraw(double amt, String account){

        if (Objects.equals(account, CHECKING))
            if(!checkOverdraft(amt,CHECKING)) {
            System.out.println("Unable to carry out transaction!\t$" + amt + " exceeds Overdraft limit!");
            }
            else {
                checkBalance -=amt;
                withdraws.add (new Withdraw(amt,CHECKING,checkBalance));
                }

        else if(Objects.equals(account, SAVING)) {
            if (!checkOverdraft(amt,SAVING)) {
                System.out.println("Unable to carry out transaction!\t$" + amt + " exceeds Overdraft limit!");
            } else {
                savingBalance -= amt;
                withdraws.add (new Withdraw(amt,SAVING,savingBalance));
            }
        }
        else{
            System.out.println("PLEASE ENTER AN APPROPRIATE ACCOUNT!");
        }
        return amt;
    }

    private boolean checkOverdraft(double amt, String account) {
boolean a;
        if (Objects.equals(account, CHECKING)) {
            if (checkBalance - amt < OVERDRAFT) {
                a = false;
            } else {
                a = true;
            }
        }
        else {
            if (savingBalance - amt < OVERDRAFT) {
                a = false;
            }
            else {
                a = true;
            }
        }

        return a;
    }
//getters
    public double getCheckBalance() {
        return checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
