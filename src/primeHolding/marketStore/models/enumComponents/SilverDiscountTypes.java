package primeHolding.marketStore.models.enumComponents;

public enum SilverDiscountTypes {
    FIRST (0.02), SECOND (0.035);

    private double rate;

    SilverDiscountTypes(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
