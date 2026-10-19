public class PaymentService {

    public void processPayment() {
        System.out.println("Processing Payment");
    }

    public void processRefund() {
        System.out.println("Processing Refund");
    }

    public void processTransaction(Payment payment) {
        System.out.println("Processing Transaction");
        payment.pay();
        payment.refund();
    }

    public void processTransaction(NonRefundablePayments payment) {
        System.out.println("Processing Transaction");
        payment.pay();
    }
}
