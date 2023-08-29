package es.nextdigital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "CARD")
public class DebitCard extends Card {

    @Column(name = "DEBIT_LIMIT", nullable = false)
    private Integer debitLimit;

}
