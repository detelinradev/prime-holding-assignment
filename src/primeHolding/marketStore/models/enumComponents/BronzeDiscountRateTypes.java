package primeHolding.marketStore.models.enumComponents;

public enum BronzeDiscountRateTypes {
    FIRST(0), SECOND(0.01), THIRD(0.025);

    private double rate;

    BronzeDiscountRateTypes(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}