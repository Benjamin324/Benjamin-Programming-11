
public class Main {
    public static void main(String[] args) {
    Customer charlie = new Customer("Charlie Hoss", 49837309, 5000,0);
   charlie.deposit(1500,Customer.CHECKING);
        charlie.deposit(1500,Customer.CHECKING);
    charlie.deposit(500,Customer.SAVING);
        charlie.deposit(500,Customer.SAVING);
    charlie.withdraw(300,Customer.CHECKING);
    charlie.withdraw(1100,Customer.SAVING);
    charlie.withdraw(19000,Customer.CHECKING);
    charlie.displayDeposits();
    charlie.displayWithdraws();
    }
}

