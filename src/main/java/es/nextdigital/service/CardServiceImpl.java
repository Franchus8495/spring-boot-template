package es.nextdigital.service;

import es.nextdigital.entity.Card;
import es.nextdigital.entity.Movement;
import es.nextdigital.repository.CardRepository;
import es.nextdigital.repository.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public String changePin(Integer cardId, String newPin) {
        Card card = this.cardRepository.findCard(cardId);
        card.changePin(newPin);
        this.cardRepository.updateCard(card);
        return card.getPin();
    }

    @Override
    public void activateCard(Integer cardId, String pin) {
        Card card = this.cardRepository.findCard(cardId);
        card.activate(pin);
        this.cardRepository.updateCard(card);
    }

    @Override
    public List<Movement> getMovements(Integer cardId) {
        return null;
    }
}
