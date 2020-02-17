package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponentsContracts.TurnoverBase;

public interface DiscountStrategy {

    double calculateDiscount (TurnoverBase turnover, double purchaseAmount);
}
