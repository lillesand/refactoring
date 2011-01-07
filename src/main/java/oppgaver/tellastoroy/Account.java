package oppgaver.tellastoroy;

public class Account {
	
	private IMoney balance;
	
	public Account() {
		balance = new Money();
	}

	public Account(IMoney balance) {
		super();
		this.balance = balance;
	}

	public int deduct(IMoney amount) {
		if (amount == null || (balance.getAmount() < amount.getAmount())) {
			return -1;
		} else {
			double bal2 = balance.getAmount()*100+.5;
			double amt2 = amount.getAmount()*100+.5;
			balance.setAmount((bal2-amt2)/100.0);
			if (balance.getAmount() == 0.0)
				return 0; // is zero
		}
		return 1;
	}

}
