import model.BasicAccount;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        BasicAccount account2 = new BasicAccount(-400, "banknr1");
        account2.getAmount();
        account2.getAccountNumber();

        account2.Deposit(100);
        account2.getAmount();

        account2.Withdraw(300);
        account2.getAmount();
        //Hier kloppen de testen
    }

}