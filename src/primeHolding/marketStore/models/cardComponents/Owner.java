package primeHolding.marketStore.models.cardComponents;


public class Owner {

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
