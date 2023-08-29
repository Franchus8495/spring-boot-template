package es.nextdigital.entity;

public enum MovementType {

    INCOME("INCOME"),
    WITHDRAW("WITHDRAW"),
    COMMISSION("COMMISSION"),
    TRANSFER_IN("TRANSFER_IN"),
    TRANSFER_OUT("TRANSFER_OUT");

    private final String description;

    private MovementType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
