package com.InversionOfControl.InversionOfControl;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService { // cardPaymentService
    @Override
    public void pay()
    {
        System.out.println("Pay with card");
    }
}
