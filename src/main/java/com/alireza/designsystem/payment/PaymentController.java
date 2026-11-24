package com.alireza.designsystem.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/payments")
public class PaymentController {

    @GetMapping
    public String pay(@RequestBody Payment payment) {
        return switch (payment) {
            case CardPayment cardPayment -> "Card Payment" + payment;
            case BankPayment bankPayment -> "Bank Payment" + payment;
        };
    }
}
