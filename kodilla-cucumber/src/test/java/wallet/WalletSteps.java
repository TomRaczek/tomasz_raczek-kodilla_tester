package wallet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WalletSteps {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final CashSlot cashSlot = new CashSlot();
    Wallet wallet;

    public WalletSteps() {
        System.setOut(new PrintStream(outContent));
    }
    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$_in_my_wallet(int arg0) {
        wallet = new Wallet();
        wallet.deposit(arg0);
        Assert.assertEquals("Incorrect wallet balance", arg0, wallet.getBalance());
    }
    @Given("there is ${int} in my wallet")
    public void thereIs$InMyWallet(int arg1) {
        wallet = new Wallet();
        wallet.deposit(arg1);
        Assert.assertEquals("Incorrect wallet balance", arg1, wallet.getBalance());
    }
    @When("I check the balance of my wallet")
    public void iCheckTheBalanceOfMyWallet() {
        wallet.getBalance();
    }
    @When("I request ${int}")
    public void i_request_$(int arg0) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, arg0);
    }
    @When("I withdraw ${int}")
    public void iWithdraw$(int arg0) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, arg0);
    }
    @Then("${int} should not be dispensed")
    public void $_should_not_be_dispensed(int arg0) {
        Assert.assertNotEquals(arg0, cashSlot.getContents());
    }
    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(int arg0) {
        cashSlot.dispense(arg0);
        Assert.assertEquals(arg0, cashSlot.getContents());
    }
    @Then("the balance of my wallet should be ${int}")
    public void the_balance_of_my_wallet_should_be_$(int arg0) {
        Assert.assertEquals("Incorrect wallet balance", arg0,  wallet.getBalance());
    }
    @Then("I should see that the balance is ${int}")
    public void iShouldSeeThatTheBalanceIs$(int arg0) {
        Assert.assertEquals("Incorrect wallet balance", arg0,  wallet.getBalance());
    }

    @Then("nothing should be dispensed")
    public void nothingShouldBeDispensed() {
        Assert.assertEquals(0,  cashSlot.getContents());
    }
    @And("I should be told that I don't have enough money in my wallet")
    public void iShouldBeToldThatIDonTHaveEnoughMoneyInMyWallet() {
        Assert.assertEquals("Not enough money in the wallet", outContent.toString().trim());
    }
}