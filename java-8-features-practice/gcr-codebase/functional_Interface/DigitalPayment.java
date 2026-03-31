package functional_Interface;

public class DigitalPayment {
    public static void main(String[] args) {
        // Creating the objects of UPI, CreditCard, Wallet class
        UPI upi = new UPI();
        CreditCard creditCard = new CreditCard();
        Wallet wallet = new Wallet();

        // Invoking the pay method for each object
        upi.pay(500000);
        creditCard.pay(500000);
        wallet.pay(500000);
    }
}

// interface DigitalPaymentInterface
interface DigitalPaymentInterface {
    void pay(double amount);
}

// UPI class implementing the interface DigitalPaymentInterface
class UPI implements DigitalPaymentInterface {
    @Override
    public void pay(double amount) {
        if (amount > 200000) {
            System.out.println("Amount Limit Exceeds payment failed.");
        } else {
            System.out.println(amount + " paid by using UPI successfully.");
        }
    }
}

// CreditCard class implementing the interface DigitalPaymentInterface
class CreditCard implements DigitalPaymentInterface {
    @Override
    public void pay(double amount) {
        if (amount > 1000000) {
            System.out.println("Amount Limit Exceeds payment failed.");
        } else {
            System.out.println(amount + " paid by using Credit Card successfully.");
        }
    }
}

// Wallet class implementing the interface DigitalPaymentInterface
class Wallet implements DigitalPaymentInterface {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by using Wallet successfully.");
    }
}
