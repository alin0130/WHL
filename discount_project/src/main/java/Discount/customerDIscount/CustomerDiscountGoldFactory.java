package Discount.customerDIscount;

import Discount.AbstractFactory;
import Discount.IDiscount;

public class CustomerDiscountGoldFactory extends AbstractFactory {
    @Override
    public IDiscount createDiscount() {
        return new CustomerDiscountGold();
    }
}
