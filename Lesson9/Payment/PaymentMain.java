package Lesson9.Payment;

public class PaymentMain {

    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Cart cart = payment.new Cart(0,0);
        cart.addProduct("Milk", 5);
        cart.addProduct("Bread", 3);

        if (cart.getTotalQuantity() > 0) {
            System.out.println("Total quantity: " + cart.getTotalQuantity() + "Total sum: " + cart.getTotalPrice());
        }


    }
}
