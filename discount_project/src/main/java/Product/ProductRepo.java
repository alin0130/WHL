package Product;

import Discount.AbstractFactory;
import Discount.CustomerDiscount;
import Discount.IDiscount;

import java.util.ArrayList;
import java.util.List;

import static Discount.DiscountType.BULK;
import static Discount.DiscountType.CUSTOMER;
import static Discount.DiscountType.NULL;

public class ProductRepo {
    private List<Product> products =new ArrayList<>();
    //private IDiscount d=null;
    public ProductRepo() {
        products.add(new Product(1, "Masa", new Price(20)));
        products.add(new Product(2, "Scaun", new Price(30)));
        products.add(new Product(3, "Fotoliu", new Price(50)));
        products.add(new Product(4, "Bucatarie", new Price(200)));
    }
    public void cmputeProductsDiscount(String customerType,int quantity){
        if(customerType!= null){
            AbstractFactory factory = AbstractFactory.getFactory(CUSTOMER);
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
