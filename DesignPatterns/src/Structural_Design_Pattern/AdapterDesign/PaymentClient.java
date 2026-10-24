package Structural_Design_Pattern.AdapterDesign;

public class PaymentClient {

    PaymentService paymentService = new PaymentService();

    public void makePayment(){
        String result = paymentService.pay(100, 1); // Example amount and customer ID
        

        if(result.equals("SUCCESS")){
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment failed");
        }

    }

}
