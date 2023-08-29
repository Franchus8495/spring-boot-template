package es.nextdigital.repository;

import es.nextdigital.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    @Query(value = "SELECT ID, CARD_NUMBER, ACCOUNT_ID, LIMIT, ACTIVE FROM CARD WHERE ID = :cardId", nativeQuery = true)
    Card findCard(Integer cardId);

    @Modifying
    @Query(value = "UPDATE CARD SET PIN = :pin, AMOUNT = :amount, ACTIVE = :isActive WHERE ID = :cardId", nativeQuery = true)
    void updateCard(Card card);

}
