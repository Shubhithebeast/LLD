package Structural_Design_Pattern.AdapterDesign;

public class PaymentService {

    PaypalGateway paypalGateway = new PaypalGateway();
    RazorpayGateway razorpayGateway = new RazorpayGateway();

    public String pay(int amount,int custId){
        int transactionResult = paypalGateway.doTransaction((double) amount, custId);
        if(transactionResult != 1){
            return "FAILURE";
        }
        return "SUCCESS";
    }

}
