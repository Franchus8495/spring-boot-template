package es.nextdigital.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Base64;
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

    @Column(name = "PIN")
    private String pin;

    @Column(name = "LIMIT", nullable = false)
    private Integer limit;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean isActive;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Movement.class)
    private List<Movement> movements;

    public Card(Integer id, Integer cardNumber, Account account, String pin, Integer limit, Boolean isActive) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.account = account;
        this.pin = this.deobfuscatePin(pin);
        this.limit = limit;
        this.isActive = isActive;
    }

    public Card() {

    }

    public String getPin() {
        return this.obfuscatePin(this.pin);
    }

    public void changePin(String newPin) {
        this.pin = newPin;
    }

    public void activate(String pin) {
        if (Boolean.FALSE.equals(this.isActive)) {
            this.isActive = Boolean.TRUE;
            this.pin = this.obfuscatePin(pin);
        } else {
            //TODO create dedicated exception
            throw new RuntimeException("Already activated cards cannot be activated");
        }
    }

    private String obfuscatePin(String pin) {
        return Base64.getEncoder().encodeToString(pin.getBytes());
    }

    private String deobfuscatePin(String pin) {
        return Arrays.toString(Base64.getDecoder().decode(pin));
    }

}
