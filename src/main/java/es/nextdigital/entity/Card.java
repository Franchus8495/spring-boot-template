package es.nextdigital.entity;

import java.util.List;

public abstract class Card {

    private Integer id;

    private Integer cardNumber;

    private Account account;

    private Integer pin;

    private Integer limit;

    private Boolean isActive;

    private List<Movement> movements;

    public void changePin(Integer newPin) {

    }

}
