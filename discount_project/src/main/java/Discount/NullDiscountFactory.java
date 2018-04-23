package Discount;

public class NullDiscountFactory extends AbstractFactory{
    @Override
    public IDiscount createDiscount() {
        return new NullDiscount();
    }
}
