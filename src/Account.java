public class Account {
    private String accountNumber;
    private double balance = 0.0;
    private String ownerName;

    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.ownerName = ownerName;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public String getAccountNumber() { return accountNumber; }

    public String getOwnerName() { return ownerName; }

    public double getBalance() { return balance; }
}
