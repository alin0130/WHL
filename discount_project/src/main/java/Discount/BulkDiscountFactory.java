package Discount;

public class BulkDiscountFactory extends AbstractFactory {
    @Override
    public IDiscount createDiscount() {
        return new BulkDiscount();
    }
}
