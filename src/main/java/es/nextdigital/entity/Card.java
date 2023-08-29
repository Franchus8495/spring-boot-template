package es.nextdigital.entity;

import java.util.List;

public abstract class Card {

    private Integer cardNumber;

    private Account account;

    private Integer pin;

    private Integer limit;

    private List<Movement> movements;

}
