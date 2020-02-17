package primeHolding.marketStore.models.cardComponents;


import primeHolding.marketStore.models.cardComponentsContracts.OwnerBase;

public class Owner implements OwnerBase {

    private String ownerName;

    public Owner( String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    private void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
