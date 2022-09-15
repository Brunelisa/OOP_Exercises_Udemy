package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	
	public static double dollar(double actualValue, double dollarBought) {
		return actualValue * dollarBought * (1.0 + IOF) ;
	}

}
