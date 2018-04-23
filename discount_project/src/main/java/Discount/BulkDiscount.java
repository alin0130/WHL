package Discount;

public class BulkDiscount implements IDiscount {
    public double applyDiscount(double price) {
        return (price -(price*0.2));
    }
}
