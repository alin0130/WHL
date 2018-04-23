package Discount;

abstract public class AbstractFactory {
    private static final NullDiscountFactory NULL_DISCOUNT_FACTORY =new NullDiscountFactory();
    private static final BulkDiscountFactory BULK_DISCOUNT_FACTORY =new BulkDiscountFactory();
    private static final CustomerDiscountFactory CUSTOMER_DISCOUNT_FACTORY=new CustomerDiscountFactory();

    static public AbstractFactory getFactory(DiscountType type){
        AbstractFactory factory = null;
        switch(type){
            case NULL:
                factory = NULL_DISCOUNT_FACTORY;
                break;
            case BULK:
                factory = BULK_DISCOUNT_FACTORY;
                break;
            case CUSTOMER:
                factory = CUSTOMER_DISCOUNT_FACTORY;
                break;
        }
        return factory;
    }
    public abstract IDiscount createDiscount();
}
