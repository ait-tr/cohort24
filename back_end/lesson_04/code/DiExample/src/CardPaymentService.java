public class CardPaymentService implements PaymentService {
    private String clientId;
    private String accountNumber;

    CardPaymentService(String clientId, String accountNumber)
    {
        this.clientId = clientId;
        this.accountNumber = accountNumber;
    }
    @Override
    public void pay()
    {
        // Payment logic
        System.out.println("Pay with card");
    }
}
