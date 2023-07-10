public class FakePayment implements PaymentService{
    @Override
    public void pay()
    {
        System.out.println("I'm not real payment system");
    }
}
