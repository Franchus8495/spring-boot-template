package es.nextdigital.service;

import es.nextdigital.entity.Account;
import es.nextdigital.entity.Card;
import es.nextdigital.entity.DebitCard;
import es.nextdigital.repository.CardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CardServiceImplTest {

    @InjectMocks
    private CardServiceImpl cardService;

    @Mock
    private CardRepository cardRepository;

    @Test
    void changePin_test() {
        Card card = new DebitCard(1, 12345, new Account(), "1234", 3000, true);
        when(this.cardRepository.findCard(isA(Integer.class))).thenReturn(card);

        String newPin = this.cardService.changePin(1, "2345");

        assertThat(newPin).isEqualTo("MjM0NQ==");
    }

    @Test
    void activateCard_test_ok() {
        Card card = new DebitCard(1, 23456, new Account(), null, 3000, false);
        when(this.cardRepository.findCard(isA(Integer.class))).thenReturn(card);

        this.cardService.activateCard(1, "1234");
    }

    @Test
    void activateCard_test_fail() {
        Card card = new DebitCard(1, 23456, new Account(), "1234", 3000, true);
        when(this.cardRepository.findCard(isA(Integer.class))).thenReturn(card);

        assertThrows(RuntimeException.class, () -> this.cardService.activateCard(1, "1234"));
    }

    @Test
    void getMovements_test() {

    }

}
