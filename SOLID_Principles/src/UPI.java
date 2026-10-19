public class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment Successful by UPI");
    }

    @Override
    public void refund() {
        System.out.println("Refund Successful by UPI");
    }

    public void checkBalance() {
        System.out.println("Checking UPI Balance");
    }
}
