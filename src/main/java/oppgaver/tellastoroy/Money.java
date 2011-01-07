package oppgaver.tellastoroy;

public class Money implements IMoney {

	private double amount = 0;
	
	public Money(double amount) {
		this();
		this.amount = amount;
	}

	public Money() {
		super();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
