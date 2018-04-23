package Discount.customerDIscount;

import Discount.AbstractFactory;
import Discount.IDiscount;

public class CustomerDiscountSilverFactory extends AbstractFactory {
    @Override
    public IDiscount createDiscount() {
        return new CustomerDiscountSilver();
    }
}
