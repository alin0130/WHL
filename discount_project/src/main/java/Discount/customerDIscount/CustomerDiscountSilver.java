package Discount.customerDIscount;

public class CustomerDiscountSilver implements CustomerDIscountI {
    @Override
    public double applyDiscount(double price) {
        return price-price*0.3;
    }
}
