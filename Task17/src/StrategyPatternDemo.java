
public class StrategyPatternDemo {

    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext();

        // Pay using UPI
        payment.setPaymentStrategy(new UpiPayment());
        payment.makePayment(500);

        // Pay using Card
        payment.setPaymentStrategy(new CreditCardPayment());
        payment.makePayment(1000);

        // Pay using Cash
        payment.setPaymentStrategy(new CashPayment());
        payment.makePayment(300);
    }
}

// Step 1: Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

// Step 3: Context Class
class PaymentContext {

    private PaymentStrategy strategy;

    // Set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount) {
        strategy.pay(amount);
    }
}
