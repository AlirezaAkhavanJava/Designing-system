package com.alireza.designsystem.payment;

record BankPayment(
        String iban, int amount
) implements Payment {
}
