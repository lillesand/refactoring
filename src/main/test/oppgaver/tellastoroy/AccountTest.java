package oppgaver.tellastoroy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testDeduct() throws Exception {
        Account account = new Account(new Money(100));

        assertEquals(account.deduct(new Money(100)), 0);
    }
}
