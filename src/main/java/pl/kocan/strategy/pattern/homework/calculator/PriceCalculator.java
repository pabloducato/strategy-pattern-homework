package pl.kocan.strategy.pattern.homework.calculator;

import pl.kocan.strategy.pattern.homework.calculator.strategy.PricingStrategy;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

}
