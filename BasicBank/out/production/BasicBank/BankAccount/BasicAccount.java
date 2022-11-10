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


    public void Deposit(double amount) {
         this.amount += amount;
        System.out.print(amount);
    }

    public boolean Withdraw(double amount) {
        return false;
    }
System.out.println(" Sorry you can't withdraw");



 }

