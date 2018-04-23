import Product.ProductRepo;

public class MainClass {
    public static void main(String[] args){
        ProductRepo repo=new ProductRepo();

        System.out.println("--------- Base price no discount EX: -----------\n");
        repo.cmputeProductsDiscount(null,0);
        repo.displayProducts();

        System.out.println("--------- BULK EX: -----------\n");
        repo.cmputeProductsDiscount(null,40);
        repo.displayProducts();

        System.out.println("--------- Customer EX: -----------\n");
        repo.cmputeProductsDiscount("CUSTOMER_1",0);
        repo.displayProducts();

    }
}
