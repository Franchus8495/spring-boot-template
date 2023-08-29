package es.nextdigital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "BANK")
public class Bank {

    @Id
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COMMISSION")
    private BigDecimal commission;

}
