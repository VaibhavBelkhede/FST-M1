package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    public class BankAccount {
        private Integer balance;

        // Create a constructor
        public BankAccount(Integer initialBalance) {
            balance = initialBalance;
        }

        // Add method to calculate
        // balance amount after withdrawal
        public Integer withdraw(Integer amount)
        {
            if (balance < amount) {
                throw new NotEnoughFundsException(amount, balance);
            }
            balance -= amount;
            return balance;
        }
    }

    public class NotEnoughFundsException extends RuntimeException {

        public NotEnoughFundsException(Integer amount, Integer balance) {
            super("Attempted to withdraw " + amount + " with a balance of " + balance);
        }

    }
@Test
    void notEnoughFunds()
    {
        BankAccount account = new BankAccount(9);

        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),"\"Balance must be greater than amount of withdrawal");
    }
@Test
void enoughFunds()
{
    BankAccount account = new BankAccount(100);
    assertDoesNotThrow(() -> account.withdraw(100));
}

}


