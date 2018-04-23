package Discount.customerDIscount;

public class CustomerDiscountGold implements CustomerDIscountI{
    @Override
    public double applyDiscount(double price) {
        return price-price*0.4;
    }
}
