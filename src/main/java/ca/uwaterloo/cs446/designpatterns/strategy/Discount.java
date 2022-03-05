package ca.uwaterloo.cs446.designpatterns.strategy;

public interface Discount {
	public double compute(double fullPrice);
}
