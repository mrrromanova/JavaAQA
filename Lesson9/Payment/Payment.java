package Lesson9.Payment;

public class Payment {

    public void payForGoods (){
    }

    public class Cart{
        int totalPrice = 0;
        int totalQuantity = 0;

        Cart(int totalPrice, int totalQuantity){

        }

        public int getTotalQuantity() {
            return totalQuantity;
        }

        public int getTotalPrice() {
            return totalPrice;
        }

        public void addProduct(String name, int price){
            totalPrice = totalPrice + price;
            totalQuantity ++;
            System.out.println("Product added to cart");

        }
    }
}
