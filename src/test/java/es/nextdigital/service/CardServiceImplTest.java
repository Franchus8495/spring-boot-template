package es.nextdigital.service;

import es.nextdigital.entity.Account;
import es.nextdigital.entity.Card;
import es.nextdigital.entity.DebitCard;
import es.nextdigital.repository.CardRepository;
import es.nextdigital.repository.CashierRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CardServiceImplTest {

    @InjectMocks
    private CardService cardService;

    @Mock
    private CardRepository cardRepository;

    @Test
    void changePin_test() {
        Card card = new DebitCard(1, 12345, new Account(), "1234", 3000, true);
        when(this.cardRepository.findCard(isA(Integer.class))).thenReturn(card);

        String newPin = this.cardService.changePin(1, "2345");

        assertThat(newPin).isEqualTo("Û~9");
    }

    @Test
    void activateCard_test() {

    }

    @Test
    void getMovements_test() {

    }

}
