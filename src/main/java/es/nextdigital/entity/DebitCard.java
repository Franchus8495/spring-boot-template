package es.nextdigital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "CARD")
public class DebitCard extends Card {

    @Column(name = "DEBIT_LIMIT", nullable = false)
    private Integer debitLimit;

    public DebitCard(Integer id, Integer cardNumber, Account account, String pin, Integer limit, Boolean isActive) {
        super(id, cardNumber, account, pin, limit, isActive);
    }

}
