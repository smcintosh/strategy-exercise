package ca.mcgill.ecse321.designpatterns.strategy;

public interface Discount {
	public double compute(double fullPrice);
}