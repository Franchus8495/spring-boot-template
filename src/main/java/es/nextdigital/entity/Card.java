package es.nextdigital.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
@Table(name = "CARD")
public abstract class Card {

    @Id
    @GeneratedValue(generator = "CARD_ID_GENERATOR", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CARD_ID_GENERATOR", sequenceName = "CARD_ID_SEQ", initialValue = 1)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;

    @Column(name = "CARD_NUMBER", nullable = false, unique = true, updatable = false)
    private Integer cardNumber;

    @Column(name = "ACCOUNT_ID", nullable = false, unique = true, updatable = false)
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "account")
    private Account account;

    @Column(name = "PIN", nullable = false)
    private Integer pin;

    @Column(name = "LIMIT", nullable = false)
    private Integer limit;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean isActive;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Movement.class)
    private List<Movement> movements;

    public void changePin(Integer newPin) {

    }

}
