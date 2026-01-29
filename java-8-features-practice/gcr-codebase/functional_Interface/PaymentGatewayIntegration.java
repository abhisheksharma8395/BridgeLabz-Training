package functional_Interface;

interface PaymentProcessor {

    // Abstract method
    void processPayment(double amount);

    // New default method for refunds
    default void refund(double amount) {
        System.out.println("Refund not supported by this provider.");
    }
}

class PaytmProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paytm payment: ₹" + amount);
    }
}


class PhonePeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PhonePe payment: ₹" + amount);
    }
}


class ModernPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing modern payment: ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund processed: ₹" + amount);
    }
}


public class PaymentGatewayIntegration {
    public static void main(String[] args) {

        PaymentProcessor paytm = new PaytmProcessor();
        paytm.processPayment(100);
        paytm.refund(100); // default behavior

        PaymentProcessor modern = new ModernPaymentProcessor();
        modern.processPayment(200);
        modern.refund(200); // overridden behavior
    }
}
