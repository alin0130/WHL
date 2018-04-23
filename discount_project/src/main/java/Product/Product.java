package Product;

import Discount.IDiscount;

public class Product {
    private int id;
    private String Name;
    private Price price;

    public Product(int id, String name, Price price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
    public void SetAndApplyDiscountStrategy(IDiscount d){
        price.SetAndApplyDiscountStrategy(d);
    }
    public void displayPrices(){
        System.out.print(" BASE_PRICE: "+this.price.getCost()+ " DISCOUNT_PRICE: "+this.price.getDiscountedCost()+"\n");
    }
}
