package es.nextdigital.service;

import es.nextdigital.entity.Movement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Override
    public void changePin(Integer cardId, Integer newPin) {

    }

    @Override
    public void activateCard(Integer cardId) {

    }

    @Override
    public List<Movement> getMovements(Integer cardId) {
        return null;
    }
}
