package oppgaver.tellastoroy;

import oppgaver.tellastoroy.exception.NotEnoughMoneyException;

public class Account {
	
	private Money balance;

	public Account(Money balance) {
		this.balance = balance;
	}

	public void deduct(Money amount) throws NotEnoughMoneyException {
        validate(amount);

        balance = balance.subtract(amount);
    }

    private void validate(Money amount) throws NotEnoughMoneyException {
        if (amount.isNegative()) {
            throw new IllegalArgumentException("Got negative amount");
        }

        if ((balance.getAmount() < amount.getAmount())) {
            throw new NotEnoughMoneyException();
}
    }

    public Money getBalance() {
        return balance;
    }
}
