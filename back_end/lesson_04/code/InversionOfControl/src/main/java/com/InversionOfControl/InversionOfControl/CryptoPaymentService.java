package com.InversionOfControl.InversionOfControl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CryptoPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Pay with crypto");
    }
}
