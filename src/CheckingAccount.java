public class CheckingAccount extends Account {
    private double overdraftLimit;

    public checkingAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName);
        this.overdraftLimit = -500.0;
    }

    @Override
    public double withdraw(double amount) {
        if (getBalance() - amount >= overdraftLimit) {
            return super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded");
            return getBalance();
        }
    }
}
