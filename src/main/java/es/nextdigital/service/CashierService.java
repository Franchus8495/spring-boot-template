package es.nextdigital.service;

import es.nextdigital.entity.MovementType;

import java.math.BigDecimal;

public interface CashierService {

    void withdraw(Integer cashierId, Integer cardId, BigDecimal amount);

    void income(Integer cashierId, Integer cardId, BigDecimal amount);

    void transfer(Integer cashierId, Integer cardId, BigDecimal amount, Integer destinationAccount, MovementType type);

}
