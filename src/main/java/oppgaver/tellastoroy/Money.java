package oppgaver.tellastoroy;

public class Money  {

	private final double amount;
	
	public Money(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}


    public boolean isNegative() {
        return amount < 0;
    }

    public Money subtract(Money amount) {
        return new Money(this.getAmount() - amount.getAmount());
    }

    @Override
    public String toString() {
        return amount +"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        if (Double.compare(money.amount, amount) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = amount != +0.0d ? Double.doubleToLongBits(amount) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }

}
