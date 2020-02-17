package primeHolding.marketStore.core.factories;

import primeHolding.marketStore.models.cardComponentsContracts.TurnoverBase;
import primeHolding.marketStore.models.enumComponents.SilverDiscountTypes;

public class DiscountStrategySilver  implements DiscountStrategy{
    private final static int FIRST_STAGE_TURNOVER = 300;


    @Override
    public double calculateDiscount(TurnoverBase turnover, double purchaseAmount) {

        if (turnover.getTurnover() < FIRST_STAGE_TURNOVER)
            return SilverDiscountTypes.FIRST.getRate();
        else return SilverDiscountTypes.SECOND.getRate();
    }
}
