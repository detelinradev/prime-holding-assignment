package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponents.Turnover;

public class CalculationStrategy {

    private DiscountStrategy discountStrategy;

    public CalculationStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateRate(Turnover turnover, double purchaseAmount){
        return discountStrategy.calculateDiscount(turnover, purchaseAmount);
    }
}
