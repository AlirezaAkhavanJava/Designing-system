package com.alireza.designsystem;

record BankPayment(
        String iban, int amount
) implements Payment {
}
