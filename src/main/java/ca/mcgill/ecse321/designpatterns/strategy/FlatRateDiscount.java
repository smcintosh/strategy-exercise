package ca.mcgill.ecse321.designpatterns.strategy;

public class FlatRateDiscount implements Discount {
	
	private double amount;
	
	public FlatRateDiscount(double amount) {
		this.amount = amount;
	}

	@Override
	public double compute(double fullPrice) {
		return fullPrice - this.amount;
	}
}