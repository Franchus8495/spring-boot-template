package es.nextdigital.entity;

public enum MovementType {

    INCOME(1, "INCOME"),
    WITHDRAW(2, "WITHDRAW"),
    COMMISSION(3, "COMMISSION"),
    TRANSFER_IN(4, "TRANSFER_IN"),
    TRANSFER_OUT(5, "TRANSFER_OUT");

    private Integer id;

    private String description;

    private MovementType(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
