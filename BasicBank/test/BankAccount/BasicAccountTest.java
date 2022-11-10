package BankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccountTest {
//use object to test all
BasicAccount account1 = new BasicAccount(200, "NL140.234");
    @org.junit.jupiter.api.Test
    void getAmount() {
        assertEquals(200,account1.getAmount());
    }

    @Test
    void falseGetAmount() {
        assertNotEquals(20,account1.getAmount());

    }

    @org.junit.jupiter.api.Test
    void getAccountNumber() {
        assertEquals("NL140.234",account1.getAccountNumber());
    }
    @Test
    void falseGetAmountNumber() {
        assertNotEquals("hello",account1.getAccountNumber());

    }

    @org.junit.jupiter.api.Test
    void deposit() {
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
    }
}