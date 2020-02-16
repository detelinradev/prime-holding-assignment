package primeHolding.marketStore.models.enumComponents;

public enum GoldDiscountTypes {
    FIRST (0.02), SECOND (0.01);

    private double rate;

    GoldDiscountTypes(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
