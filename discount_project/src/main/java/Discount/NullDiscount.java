package Discount;

public class NullDiscount implements IDiscount {
    public double applyDiscount(double price) {
        return price;
    }
}
