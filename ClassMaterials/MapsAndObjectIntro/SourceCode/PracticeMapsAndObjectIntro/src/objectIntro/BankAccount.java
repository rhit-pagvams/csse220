package objectIntro;

public class BankAccount {
    private String name;
    private double balance;

    /**
     * Constructs a default bank account
     */
    public BankAccount() {
        this.name = "UNKNOWN";
        this.balance = 0;

    }

    /**
     * Constructs an account with the given name and starting balance
     * @param name
     * @param initialBalance
     */


    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
