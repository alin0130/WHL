package Discount;

public class CustomerDiscountFactory extends AbstractFactory {
    @Override
    public IDiscount createDiscount() {
        return new CustomerDiscount();
    }
}
