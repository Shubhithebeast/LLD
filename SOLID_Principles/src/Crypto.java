public class Crypto implements NonRefundablePayments {
    @Override
    public void pay() {
        System.out.println("Payment Successful by Crypto");
    }

}
