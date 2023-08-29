package es.nextdigital.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(generator = "ACCOUNT_SEQ_GENERATOR", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ACCOUNT_SEQ_GENERATOR", sequenceName = "ACCOUNT_SEQ")
    private Integer id;

    @OneToOne(targetEntity = Bank.class, optional = false, fetch = FetchType.EAGER)
    private Bank bank;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    public void income(Movement movement) {

    }

    public void withdraw(Movement movement) {

    }

    public void transfer(Account destinationAccount) {

    }

}
