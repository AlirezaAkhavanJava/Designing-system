package com.alireza.designsystem;

sealed interface Payment permits
        CardPayment,
        BankPayment {

}
