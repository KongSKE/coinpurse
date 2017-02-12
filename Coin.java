package coinpurse;

/**
 * a coin with a monetary value and currency
 * 
 * @author Varit Assavavisidchai
 */

public class Coin implements Comparable<Coin> {
	public static final String DEFAULT_CURRENCY = "Baht";
	/** Value of the coin. */
	private final double value;
	/** The currency, of course. */
	private final String currency;

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value is the Value of the coin
	 */
	public Coin(double value) {
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value is the value of the coin
	 * @param currency is unit
	 */
	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	/**
	 * get the Value of coin
	 * @return value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * get the Currency of coin
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * if obj don't has anything and obj doesn't equals this.getClass, it will return false
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		Coin other = (Coin) obj;
		return other.equals(obj) && other.getCurrency().equals(obj);
	}

	/**
	 * Show explanation of Value and Currency
	 */
	public String toString() {
		return value + "-" + currency + ".";
	}

	public int compareTo(Coin other) {
		if (this.value < other.value)
			return -1;
		if (this.value > other.value)
			return 1;
		return 0;
	}
}

