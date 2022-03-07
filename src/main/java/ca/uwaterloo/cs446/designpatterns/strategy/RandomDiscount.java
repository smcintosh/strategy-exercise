package ca.uwaterloo.cs446.designpatterns.strategy;

import java.util.Random;

public class RandomDiscount implements Discount {
    private Double percent;

    public RandomDiscount() {
        Random r = new Random();
        percent = r.nextDouble(0.01, 0.51);
    }

    @Override
    public double compute(double fullPrice) {
        
        return fullPrice * (1 - percent);
    }
    
}
