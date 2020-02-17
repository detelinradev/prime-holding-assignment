package primeHolding.marketStore.models.cardImpl;

import primeHolding.marketStore.core.factories.CalculationStrategy;
import primeHolding.marketStore.models.cardComponents.Owner;
import primeHolding.marketStore.models.cardComponents.Turnover;
import primeHolding.marketStore.models.cardContracts.Card;

public abstract class BaseCard implements Card {

    abstract static class Builder<T extends Builder<T>> {
        private CalculationStrategy calculationStrategy;
        private Owner owner;
        private Turnover turnover;

        public T withCalculationStrategy(CalculationStrategy calculationStrategy) {
            this.calculationStrategy = calculationStrategy;

            return self();
        }

        public T withOwner(Owner owner) {
            this.owner = owner;

            return self();
        }

        public T withTurnover(Turnover turnover) {
            this.turnover = turnover;

            return self();
        }

        abstract BaseCard build();

        protected abstract T self();
    }

    private CalculationStrategy calculationStrategy;
    private Owner owner;
    private Turnover turnover;

    BaseCard(Builder<?> builder) {
        calculationStrategy = builder.calculationStrategy;
        owner = builder.owner;
        turnover = builder.turnover;
    }

    public CalculationStrategy getCalculationStrategy() {
        return calculationStrategy;
    }

    public Owner getOwner() {
        return owner;
    }

    public Turnover getTurnover() {
        return turnover;
    }
}
