package es.nextdigital.controller;

import es.nextdigital.dto.MovementDTO;
import es.nextdigital.entity.Movement;
import es.nextdigital.mapper.RestMovementMapper;
import es.nextdigital.service.CardService;
import es.nextdigital.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/cashier")
public class CashierController {

    @Autowired
    private CashierService cashierService;

    @Autowired
    private CardService cardService;

    @Autowired
    private RestMovementMapper restMovementMapper;

    @PostMapping("/activate")
    public ResponseEntity<Void> activateCard(@RequestAttribute Integer cardId) {
        this.cardService.activateCard(cardId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("/change-pin")
    public ResponseEntity<Void> changePin(@RequestAttribute Integer cashierId, @RequestAttribute Integer cardId, @RequestAttribute Integer newPin) {
        this.cardService.changePin(cardId, newPin);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("/check-movements")
    public ResponseEntity<List<MovementDTO>> checkMovements(@RequestAttribute Integer cardId) {
        List<Movement> movements = this.cardService.getMovements(cardId);
        return ResponseEntity.ok(this.restMovementMapper.asDTOList(movements));
    }

    @PostMapping("/withdraw")
    public ResponseEntity<Void> withdrawMoney(@RequestAttribute Integer cashierId, @RequestAttribute Integer cardId, @RequestAttribute Integer amount) {

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("/income")
    public ResponseEntity<Void> incomeMoney(@RequestAttribute Integer cashierId, @RequestAttribute Integer cardId, @RequestAttribute Integer amount) {

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping("/transfer")
    public ResponseEntity<Void> transferMoney(@RequestAttribute Integer cashierId, @RequestAttribute Integer cardId, @RequestAttribute Integer amount, @RequestAttribute Integer destinationAccountNumber, @RequestAttribute Integer transferType) {

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
