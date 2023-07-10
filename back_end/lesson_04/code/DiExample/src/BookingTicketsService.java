public class BookingTicketsService {
    private PaymentService paymentService; // Depends from only interface now

    public BookingTicketsService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void doBooking()
    {
        System.out.println("Booking ticket....");
        paymentService.pay();
    }
}
