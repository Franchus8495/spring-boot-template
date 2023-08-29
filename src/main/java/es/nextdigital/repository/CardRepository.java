package es.nextdigital.repository;

import es.nextdigital.entity.Card;

public interface CardRepository {

    Card findCard(Integer cardId);

    void updateCard(Card card);

}
