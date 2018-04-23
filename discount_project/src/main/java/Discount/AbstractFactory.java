package Discount;

import Discount.customerDIscount.*;

abstract public class AbstractFactory {
    private static final NullDiscountFactory NULL_DISCOUNT_FACTORY =new NullDiscountFactory();
    private static final BulkDiscountFactory BULK_DISCOUNT_FACTORY =new BulkDiscountFactory();

    private static final CustomerDiscountSilverFactory CUSTOMER_DISCOUNT_SILVER_FACTORY= new CustomerDiscountSilverFactory();
    private static final CustomerDiscountGoldFactory CUSTOMER_DISCOUNT_GOLD_FACTORY= new CustomerDiscountGoldFactory();


    static public AbstractFactory getFactory(DiscountType type){
        AbstractFactory factory = null;
        switch(type){
            case NULL:
                factory = NULL_DISCOUNT_FACTORY;
                break;
            case BULK:
                factory = BULK_DISCOUNT_FACTORY;
                break;
        }
        return factory;
    }
    static public AbstractFactory getCustomerFactory(CustomerType type){
        AbstractFactory factory = null;
        switch(type){
            case CUSTOMER_GOLD:
                factory = CUSTOMER_DISCOUNT_GOLD_FACTORY;
                break;
            case CUSTOMER_SILVER:
                factory = CUSTOMER_DISCOUNT_SILVER_FACTORY;
                break;
        }
        return factory;
    }
    public abstract IDiscount createDiscount();
}
