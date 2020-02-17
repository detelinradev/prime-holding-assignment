package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponentsContracts.TurnoverBase;

public class CalculationStrategy {

    private DiscountStrategy discountStrategy;

    public CalculationStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateRate(TurnoverBase turnover, double purchaseAmount){
        return discountStrategy.calculateDiscount(turnover, purchaseAmount);
    }
}
