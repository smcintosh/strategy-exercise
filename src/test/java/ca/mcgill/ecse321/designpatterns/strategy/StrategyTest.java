package ca.mcgill.ecse321.designpatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {
	@Test
	public void test() {
		// Flat rate
		Discount discount = new FlatRateDiscount(5);
		assertEquals(discount.compute(100), 95, 0.001);
		
		discount = new PercentDiscount(25);
		assertEquals(discount.compute(100), 75, 0.001);
	}
}