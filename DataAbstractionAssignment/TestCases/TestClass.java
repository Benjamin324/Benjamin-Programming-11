import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClass {
        Deposit depositTest;
        Withdraw withdrawTest;
        Customer Test;

        @Before
        public void setup() {
        Test = new Customer();


}

        @Test
        public void testDepositToString(){
                //creates a new deposit object
                depositTest = new Deposit(1,Customer.SAVING,1);
                //Compares to expected string
               Assert.assertEquals("Deposit of: $1.0 Date: " + new Date() +" into account: Saving Current Balance in Saving is: $1.0", depositTest.toString());
        }
        @Test
        public void testWithdrawToString(){
                //creates a new withdraw object
                withdrawTest = new Withdraw(1,Customer.SAVING,1);
                //Compares to expected string
                Assert.assertEquals("Withdrawal of: $1.0 Date: " + new Date() +" from account: Saving Current Balance in Saving is: $1.0",withdrawTest.toString());
        }
        @Test
        public void testDeposit(){
                //Makes a new deposit
                Test.deposit(100,Customer.CHECKING);
                //Checks if the balance is changed
                Assert.assertEquals(Test.getCheckBalance(),100.0,0.1);

        }
        @Test
        public void testWithdraw(){
                //Makes a new withdrawal
                Test.withdraw(90,Customer.CHECKING);
                //Checks if the balance is changed
                Assert.assertEquals(Test.getCheckBalance(),-90.0,0.1);

        }

}
