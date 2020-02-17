package primeHolding.marketStore.models.cardContracts;

import primeHolding.marketStore.core.factories.CalculationStrategy;
import primeHolding.marketStore.models.cardComponentsContracts.TurnoverBase;

public interface Card {

    CalculationStrategy getCalculationStrategy();

    TurnoverBase getTurnover();
}

