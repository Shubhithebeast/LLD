public class PaymentService {

    public void processPayment(String payment) {
        if(payment.equals("UPI")) {
            System.out.println("Processing UPI Payment");
        }else if(payment.equals("CARD")) {
            System.out.println("Processing Card Payment");
        }else if(payment.equals("NETBANKING")) {
            System.out.println("Processing Netbanking Payment");
        }else {
            System.out.println("Invalid Payment Method");
        }

        System.out.println("Processed Payment");
    }

    public void processRefund() {
        System.out.println("Processing Refund");
    }
}
