package com.alireza.designsystem;

record CardPayment(
        String cardLast4, int amount
) implements Payment {
}
