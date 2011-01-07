package oppgaver.tellastoroy;

import oppgaver.tellastoroy.exception.NotEnoughMoneyException;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AccountTest {

    @Test
    public void shouldBeAbleToDeductEntireBalance() throws Exception {
        Account account = new Account(new Money(100));

        account.deduct(new Money(100));
        Money remainingAmount = account.getBalance();

        assertEquals(remainingAmount, new Money(0));
    }

    @Test
    public void shouldReturnRemainingAmount() throws Exception{
        Account account = new Account(new Money(100));

        account.deduct(new Money(50));

        assertEquals(account.getBalance(), new Money(50));
    }

    @Test (expected = NotEnoughMoneyException.class)
    public void shouldNotAllowDeductingMoreThanCurrentBalance() throws Exception {
        Account account = new Account(new Money(100));

        account.deduct(new Money(101));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowToDeductANegativeAmount() throws Exception {
        Account account = new Account(new Money(100));

        account.deduct(new Money(-10));
    }
    
}
