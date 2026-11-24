package com.alireza.designsystem.payment;

record CardPayment(
        String cardLast4, int amount
) implements Payment {
}
