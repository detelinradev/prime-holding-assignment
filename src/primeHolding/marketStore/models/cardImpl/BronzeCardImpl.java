package primeHolding.marketStore.models.cardImpl;

import primeHolding.marketStore.models.cardContracts.BronzeCard;

public class BronzeCardImpl extends BaseCard implements BronzeCard {

    public static class Builder extends BaseCard.Builder<Builder>{
        private final long accountNumber;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
       public BaseCard build() {
            return new BronzeCardImpl(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    private long accountNumber;

    private BronzeCardImpl(Builder builder) {
        super(builder);
        accountNumber = builder.accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
