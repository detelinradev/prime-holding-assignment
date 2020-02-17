package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponentsContracts.TurnoverBase;
import primeHolding.marketStore.models.enumComponents.GoldDiscountTypes;

public class DiscountStrategyGold implements DiscountStrategy {

    private final static int FIRST_STAGE_TURNOVER = 100;


    @Override
    public double calculateDiscount(TurnoverBase turnover, double purchaseAmount) {

        if (turnover.getTurnover() < FIRST_STAGE_TURNOVER)
            return GoldDiscountTypes.FIRST.getRate();
        else {
            if (turnover.getTurnover() >= 900) {
                return 0.1;
            } else
                return GoldDiscountTypes.SECOND.getRate() * (turnover.getTurnover() / 100) + 2;
        }
    }
}
