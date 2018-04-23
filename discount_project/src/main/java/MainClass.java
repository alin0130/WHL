import Discount.customerDIscount.CustomerType;
import Product.ProductRepo;

public class MainClass {
    public static void main(String[] args){
        ProductRepo repo=new ProductRepo();

        System.out.println("\n--------- Base price no discount -----------\n");
        repo.computeProductsDiscount(null,0);
        repo.displayProducts();

        System.out.println("\n--------- BULK DIscount -----------\n");
        repo.computeProductsDiscount(null,40);
        repo.displayProducts();

        System.out.println("\n--------- Customer GOLD Discount -----------\n");
        repo.computeProductsDiscount(CustomerType.CUSTOMER_GOLD,0);
        repo.displayProducts();

        System.out.println("\n--------- Customer SILVER DISCOUNT  -----------\n");
        repo.computeProductsDiscount(CustomerType.CUSTOMER_SILVER,0);
        repo.displayProducts();
    }
}
