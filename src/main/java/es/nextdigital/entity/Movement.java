package es.nextdigital.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "MOVEMENT")
public class Movement {

    @Id
    @GeneratedValue(generator = "MOVEMENT_SEQ_GENERATOR", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "MOVEMENT_SEQ_GENERATOR", sequenceName = "MOVEMENT_SEQ", initialValue = 1)
    private Integer id;

    @Column(name = "MOVEMENT_TYPE", nullable = false)
    private MovementType movementType;

    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

}
