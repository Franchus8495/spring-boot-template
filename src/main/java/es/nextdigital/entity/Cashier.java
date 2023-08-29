package es.nextdigital.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CASHIER")
public class Cashier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CASHIER_SEQ_GENERATOR")
    @SequenceGenerator(name = "CASHIER_SEQ_GENERATOR", sequenceName = "CASHIER_SEQ", initialValue = 1)
    @Column(name = "ID")
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER, optional = false, targetEntity = Bank.class)
    private Bank bank;

    public void action(Movement movement) {

    }
}
