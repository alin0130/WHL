package Product;

import Discount.IDiscount;
import Discount.NullDiscount;

public class Price {
    private IDiscount discount;
    private double cost,discountedCost;

    public Price(double cost) {
        this.discount = new NullDiscount();
        this.cost = cost;
    }

    public IDiscount getDiscount() {
        return discount;
    }

    public void setDiscount(IDiscount discount) {
        this.discount = discount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDiscountedCost() {
        return discountedCost;
    }

    public void setDiscountedCost(double discountedCost) {
        this.discountedCost = discountedCost;
    }
    public void SetAndApplyDiscountStrategy(IDiscount d){
        this.discount=d;
        this.discountedCost=this.discount.applyDiscount(this.cost);
    }
}
