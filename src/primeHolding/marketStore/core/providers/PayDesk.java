package primeHolding.marketStore.core.providers;

import primeHolding.marketStore.models.cardContracts.Card;

import java.text.DecimalFormat;

public class PayDesk {

    public static void printOut(Card card, double purchaseAmount) {

        System.out.println();
        System.out.printf("Purchase value: $%.2f%n", purchaseAmount);

        DecimalFormat df = new DecimalFormat("#.#%");
        System.out.println("Discount rate: " + df.format(card.getCalculationStrategy()
                .calculateRate(card.getTurnover(), purchaseAmount)));

        double discount = card.getCalculationStrategy()
                .calculateRate(card.getTurnover(), purchaseAmount) * purchaseAmount;
        System.out.printf("Discount: $%.2f%n", discount);
        System.out.printf("Total: $%.2f%n", purchaseAmount - discount);

        System.out.println("--------------------");
    }
}
