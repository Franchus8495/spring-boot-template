package es.nextdigital.service;

import es.nextdigital.entity.MovementType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CashierServiceImpl implements CashierService {

    @Override
    public void withdraw(Integer cashierId, Integer cardId, BigDecimal amount) {

    }

    @Override
    public void income(Integer cashierId, Integer cardId, BigDecimal amount) {

    }

    @Override
    public void transfer(Integer cashierId, Integer cardId, BigDecimal amount, Integer destinationAccount, MovementType type) {

    }
}
