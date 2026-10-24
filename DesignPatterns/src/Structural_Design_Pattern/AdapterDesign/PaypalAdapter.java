package Structural_Design_Pattern.AdapterDesign;

public class PaypalAdapter implements PaymentService { 
    PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String pay(int amount, int custId) {
        int transactionResult = paypalGateway.doTransaction(Double.valueOf(amount), custId);
        if(transactionResult != 1){
            return "FAILURE";
        }
        return "SUCCESS";
    }

}
