package es.nextdigital.service;

import es.nextdigital.entity.Movement;

import java.util.List;

public interface CardService {

    void changePin(Integer cardId, Integer newPin);

    void activateCard(Integer cardId);

    List<Movement> getMovements(Integer cardId);

}
