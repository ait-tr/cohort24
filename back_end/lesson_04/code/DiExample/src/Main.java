public class Main {
    public static void main(String[] args) {
        //PaymentService paymentService = new CardPaymentService("client1333", "28732179-BBB-12333");
        //PaymentService paymentService = new CryptoPaymentService();
        PaymentService paymentService = new FakePayment();
        BookingTicketsService bookingTicketsService = new BookingTicketsService(paymentService);
        bookingTicketsService.doBooking();
    }
}