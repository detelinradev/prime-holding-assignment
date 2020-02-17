package primeHolding.marketStore.models.cardComponents;


import primeHolding.marketStore.models.cardComponentsContracts.TurnoverBase;

public class Turnover implements TurnoverBase {

    private double turnover;

    public Turnover(double turnover) {
        this.turnover = turnover;
    }

    @Override
    public double getTurnover() {
        return turnover;
    }

    private void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
