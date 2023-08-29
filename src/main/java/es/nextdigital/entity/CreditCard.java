package es.nextdigital.entity;

public class CreditCard extends Card {

    public CreditCard(Integer id, Integer cardNumber, Account account, String pin, Integer limit, Boolean isActive) {
        super(id, cardNumber, account, pin, limit, isActive);
    }

}
