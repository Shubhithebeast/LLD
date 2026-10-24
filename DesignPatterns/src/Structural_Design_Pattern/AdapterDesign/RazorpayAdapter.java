package Structural_Design_Pattern.AdapterDesign;

public class RazorpayAdapter implements PaymentService {
    RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public String pay(int amount, int custId) {
        boolean transactionResult = razorpayGateway.performTransaction((double) amount, (double) custId);
        if(!transactionResult){
            return "FAILURE";
        }
        return "SUCCESS";
    }
}
