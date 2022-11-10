package model;


public class BasicAccount {
    //Fields
    private static final double MAX_LIMIT = -500.00;
    private double amount = 0.00;
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
        System.out.println("The current amount is "+amount);
        return amount;
    }
    public String getAccountNumber() {
        System.out.println("The account number is " +accountNumber+"\n");
        return accountNumber;
    }

    public void Deposit(double amt) {
        System.out.println("My deposit is " + amt);
        amount += amt;

    }

    public boolean Withdraw (double amt)  {
        System.out.println("Withdraw is "+ amt);
        //check if amount withdrawn doesn't go over limit
        if (amount-amt <= MAX_LIMIT) {
            System.out.println("Sorry can't withdraw less than "+ MAX_LIMIT);
            return false;
        }else {
            amount -= amt;
            return true;
        }
    }
}