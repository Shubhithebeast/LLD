public class Crypto implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment Successful by Crypto");
    }

    @Override
    public void refund() {
        throw new UnsupportedOperationException("Refund not supported for Crypto payments");
    }
}
