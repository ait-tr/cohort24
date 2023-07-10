package com.InversionOfControl.InversionOfControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component // 1. Needs for spring
public class BookingTicketsService {
    private PaymentService paymentService;

    @Autowired // Spring annotation. Please use this method for inject dep
    public void setPaymentService(PaymentService paymentService) // 2. Needs for inject
    {
        this.paymentService = paymentService;
    }
    public void bookTicket()
    {
        System.out.println("Booking ticket...");
        paymentService.pay();
    }
}
