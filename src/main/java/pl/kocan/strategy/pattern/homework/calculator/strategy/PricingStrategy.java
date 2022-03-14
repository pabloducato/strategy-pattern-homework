package pl.kocan.strategy.pattern.homework.calculator.strategy;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
