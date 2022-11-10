package BankAccount;

public class BasicAccount {
    private static final int MAX_LIMIT = -500;
    private double amount = 0;
    private String accountNumber;

//constructor
    public BasicAccount(double amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }
    public BasicAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //methods
    public double getAmount() {
        return amount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }


    public double Deposit(double amount) {
        return this.amount + amount;
    }

    public boolean Withdraw(double amount) {
        if (amount > MAX_LIMIT) {
            return false;
        }
        return true;
    }

 }

