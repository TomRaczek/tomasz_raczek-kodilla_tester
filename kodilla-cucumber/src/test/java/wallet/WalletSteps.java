package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @Given("I have deposited $10 in my wallet")
    public void i_have_deposited_$10_in_my_wallet() {
        wallet.deposit(10);
        Assert.assertEquals("Incorrect wallet balance", 10, wallet.getBalance());
    }

    @Then("$30 should not be dispensed")
    public void $30_should_not_be_dispensed() {
        Assert.assertNotEquals(30, cashSlot.getContents());
    }

    @When("I request $200")
    public void i_request_to_withdraw_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("$200 should be dispensed")
    public void $200_should_be_dispensed() {
        Assert.assertEquals(200, cashSlot.getContents());
    }

    @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        Assert.assertEquals(0, cashSlot.getContents());
    }

    @When("I request $0")
    public void i_request_to_withdraw_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
    }
}