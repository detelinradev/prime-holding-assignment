package primeHolding.marketStore;

import primeHolding.marketStore.core.factories.CalculationStrategy;
import primeHolding.marketStore.core.factories.DiscountStrategyBronze;
import primeHolding.marketStore.core.factories.DiscountStrategyGold;
import primeHolding.marketStore.core.factories.DiscountStrategySilver;
import primeHolding.marketStore.core.providers.PayDesk;
import primeHolding.marketStore.models.cardComponents.Owner;
import primeHolding.marketStore.models.cardComponents.Turnover;
import primeHolding.marketStore.models.cardContracts.Card;
import primeHolding.marketStore.models.cardImpl.BronzeCardImpl;
import primeHolding.marketStore.models.cardImpl.GoldCardImpl;
import primeHolding.marketStore.models.cardImpl.SilverCardImpl;

public class StartUp {
    public static void main(String[] args) {

        Card bronzeCard = new BronzeCardImpl.Builder(1)
                .withOwner(new Owner("Mark Wo"))
                .withCalculationStrategy(new CalculationStrategy(new DiscountStrategyBronze()))
                .withTurnover(new Turnover(0))
                .build();

        PayDesk.printOut(bronzeCard,150);

        Card silverCard = new SilverCardImpl.Builder(2)
                .withOwner(new Owner("Denis Colt"))
                .withCalculationStrategy(new CalculationStrategy(new DiscountStrategySilver()))
                .withTurnover(new Turnover(600))
                .build();

        PayDesk.printOut(silverCard,850);

        Card goldCard = new GoldCardImpl.Builder(3)
                .withOwner(new Owner("Harry Richardson"))
                .withCalculationStrategy(new CalculationStrategy(new DiscountStrategyGold()))
                .withTurnover(new Turnover(1500))
                .build();

        PayDesk.printOut(goldCard,1300);
    }
}
