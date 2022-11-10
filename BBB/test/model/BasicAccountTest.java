package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccountTest {
    double delta = 0.001;
    //object
    BasicAccount account1 = new BasicAccount(0, "NL140.234");

    //Get amount with correct input
    @org.junit.jupiter.api.Test
    void getAmount() {
        assertEquals(0, account1.getAmount());
    }

    //Check wrong amount
    @Test
    void falseGetAmount() {
        assertNotEquals(20, account1.getAmount());
    }

    //Get account name with correct input
    @org.junit.jupiter.api.Test
    void getAccountNumber() {
        assertEquals("NL140.234", account1.getAccountNumber());
    }

    //Get account name with false input
    @Test
    void falseGetAmountNumber() {
        assertNotEquals("hello", account1.getAccountNumber());
    }

    //test if there is an input
    @org.junit.jupiter.api.Test
    void deposit() {
        //arranger
        account1.Deposit(100);
        //act
        double amountWithdrawn = account1.getAmount();
        //assert
        assertNotNull(amountWithdrawn);
    }
//Test withdraw over the limit
    // Message will show if test fails
    @Test
    void withdrawOver() {
        assertFalse(account1.Withdraw(550),"Value didn't exceed the limit");
    }

    //Test withdraw above the limit
    @Test
    void withdrawAbove() {
        BasicAccount account3 = new BasicAccount(100, "NL150.234");

        assertTrue(account3.Withdraw(100));
    }

    //Test withdraw the limit amount, exception visible
    @Test
    void withdrawBorder() {
        assertFalse(account1.Withdraw(500));
    }

}
