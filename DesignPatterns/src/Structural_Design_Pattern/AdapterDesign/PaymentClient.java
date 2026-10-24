package Structural_Design_Pattern.AdapterDesign;

public class PaymentClient {

    PaymentService paymentService ;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(){
        String result = paymentService.pay(100, 1); // Example amount and customer ID
        

        if(result.equals("SUCCESS")){
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment failed");
        }

    }

}
