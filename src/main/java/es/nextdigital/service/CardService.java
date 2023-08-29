package es.nextdigital.service;

import es.nextdigital.entity.Movement;

import java.util.List;

public interface CardService {

    String changePin(Integer cardId, String newPin);

    void activateCard(Integer cardId, String pin);

    List<Movement> getMovements(Integer cardId);

}
