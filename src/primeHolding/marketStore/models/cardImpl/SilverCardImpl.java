package primeHolding.marketStore.models.cardImpl;

import primeHolding.marketStore.models.cardContracts.SilverCard;

public class SilverCardImpl extends BaseCard implements SilverCard {

    public static class Builder extends BaseCard.Builder<Builder>{
        private final long accountNumber;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public BaseCard build() {
            return new SilverCardImpl(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    private long accountNumber;

    private SilverCardImpl(Builder builder) {
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
