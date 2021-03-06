package Product;

import Discount.AbstractFactory;
import Discount.IDiscount;
import Discount.customerDIscount.CustomerType;

import java.util.ArrayList;
import java.util.List;

import static Discount.DiscountType.BULK;
import static Discount.DiscountType.CUSTOMER;
import static Discount.DiscountType.NULL;

public class ProductRepo {
    private List<Product> products =new ArrayList<>();
    //private IDiscount d=null;
    public ProductRepo() {
        // Products
        products.add(new Product(1, "Product 1", new Price(20)));
        products.add(new Product(2, "Product 2", new Price(30)));
        products.add(new Product(3, "Product 3", new Price(50)));
        products.add(new Product(4, "Product 3", new Price(200)));
    }
    public void computeProductsDiscount(CustomerType customerType, int quantity){
        if(customerType!= null){
            AbstractFactory factory = AbstractFactory.getCustomerFactory(customerType);
            IDiscount d=factory.createDiscount();
            applyDiscount(d);
        }else if(quantity>20){
                AbstractFactory factory = AbstractFactory.getFactory(BULK);
                IDiscount d=factory.createDiscount();
                applyDiscount(d);
            }else {
                AbstractFactory factory = AbstractFactory.getFactory(NULL);
                IDiscount d=factory.createDiscount();
                applyDiscount(d);
            }
    }
    public void applyDiscount(IDiscount d){
        for(Product p:products){
            p.SetAndApplyDiscountStrategy(d);
        }
    }
    public void displayProducts(){
        for(Product p:products){
            System.out.print("ID : "+p.getId()+"  NAME: "+p.getName());
            p.displayPrices();
        }
    }
}
