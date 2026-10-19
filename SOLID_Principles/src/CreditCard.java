public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment Successful by Credit Card");
    }

    @Override
    public void refund() {
        System.out.println("Refund Successful by Credit Card");
    }
}
