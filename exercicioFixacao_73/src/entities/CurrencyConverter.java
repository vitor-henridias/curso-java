package entities;

public class CurrencyConverter {

	public static double dollarPrice;
	public static double dollarBuyQuantity;
	public static final double IOF = 0.06;
	
	public static double amount() {
		return ((1 + IOF) * dollarPrice * dollarBuyQuantity);
	}
}