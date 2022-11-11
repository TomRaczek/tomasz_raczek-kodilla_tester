package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void notEnoughMoney() {
        System.out.println("Not enough money in the wallet");
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance()) {
            this.notEnoughMoney();
        } else {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
    }
}