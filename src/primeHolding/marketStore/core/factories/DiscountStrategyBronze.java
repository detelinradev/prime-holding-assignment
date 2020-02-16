package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponents.Turnover;
import primeHolding.marketStore.models.enumComponents.BronzeDiscountRateTypes;

public class DiscountStrategyBronze implements DiscountStrategy {

    private final static int FIRST_STAGE_TURNOVER = 100;
    private final static int SECOND_STAGE_TURNOVER = 300;

    @Override
    public double calculateDiscount(Turnover turnover, double valueOfPurchase) {
        if (turnover.getTurnover() < FIRST_STAGE_TURNOVER)
            return BronzeDiscountRateTypes.FIRST.getRate();
        else if (turnover.getTurnover() < SECOND_STAGE_TURNOVER)
            return BronzeDiscountRateTypes.SECOND.getRate();
        else return BronzeDiscountRateTypes.THIRD.getRate();
    }
}
