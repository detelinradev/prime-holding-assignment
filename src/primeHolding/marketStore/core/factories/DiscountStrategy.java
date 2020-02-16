package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponents.Turnover;

public interface DiscountStrategy {

    double calculateDiscount (Turnover turnover, double purchaseAmount);
}
