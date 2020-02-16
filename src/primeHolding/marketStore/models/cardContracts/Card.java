package primeHolding.marketStore.models.cardContracts;

import primeHolding.marketStore.core.factories.CalculationStrategy;
import primeHolding.marketStore.models.cardComponents.Turnover;

public interface Card {

    CalculationStrategy getCalculationStrategy();

    Turnover getTurnover();
}

